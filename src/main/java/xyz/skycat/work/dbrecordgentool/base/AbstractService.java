package xyz.skycat.work.dbrecordgentool.base;

import static com.ninja_squad.dbsetup.Operations.*;

import java.util.List;
import java.util.Map;

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.util.DbSetupUtil;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.operation.Insert.Builder;
import com.ninja_squad.dbsetup.operation.Insert.RowBuilder;
import com.ninja_squad.dbsetup.operation.Operation;

/**
 * @author Shotaro.S
 *
 */
public abstract class AbstractService {

	protected Parameter p;

	public AbstractService(Parameter p) {

		this.p = p;
	}

	public void operation() {

		Operation DELETE_PARTIAL = sql(createDeleteSql());

		Builder builder = insertInto(getTableName());

		Map<String, Object> defValueMap = getDefaultValueMap();
		for (String key : defValueMap.keySet()) {
			builder = builder.withDefaultValue(key, defValueMap.get(key));
		}

		for (Map<String, Object> valueMap : getColumnsList()) {
			RowBuilder rb = builder.row();
			for (String key : valueMap.keySet()) {
				rb = rb.column(key, valueMap.get(key));
			}
			builder = rb.end();
		}

		Operation INSERT = builder.build();

		Operation ops = sequenceOf(DELETE_PARTIAL, INSERT);

		DbSetup dbSetup = new DbSetup(DbSetupUtil.getDestination(p.dbUrl,
				p.dbUser, p.dbPassword), ops);
		dbSetup.launch();
	}

	public String createDeleteSql() {
		return "DELETE FROM " + getTableName() + " WHERE " + getWhereString();
	}

	public abstract String getTableName();

	protected String getWhereString() {
		return p.sysColumnName + " = \"" + p.sysColumnValue + "\"";
	}

	public abstract Map<String, Object> getDefaultValueMap();

	public abstract void setColumnsList(List<Map<String, Object>> columnsList);

	public abstract List<Map<String, Object>> getColumnsList();

}
