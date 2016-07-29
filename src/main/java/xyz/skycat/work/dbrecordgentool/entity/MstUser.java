package xyz.skycat.work.dbrecordgentool.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.base.AbstractEntity;

/**
 * @author Shotaro.S
 *
 */
public class MstUser extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String ID = "ID";
    public static final String USER_ID = "USER_ID";
    public static final String USER_PASSWORD = "USER_PASSWORD";
    public static final String DEL_FLG = "DEL_FLG";
    public static final String INS_MODULE_ID = "INS_MODULE_ID";

    /*
     * Default Value
     */
    public long id;
    public String userId = "";
    public String userPassword = "";
    public boolean delFlg;
    public String insModuleId = "";

    public MstUser(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "MST_USER";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ID", id);
        map.put("USER_ID", userId);
        map.put("USER_PASSWORD", userPassword);
        map.put("DEL_FLG", delFlg);
        map.put("INS_MODULE_ID", p.sysColumnValue);
        return map;
    }

}
