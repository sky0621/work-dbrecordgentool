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
    public static final String id = "id";
    public static final String user_id = "user_id";
    public static final String user_password = "user_password";
    public static final String del_flg = "del_flg";

    /*
     * Default Value
     */
    public Long _id;
    public String _userId;
    public String _userPassword;
    public Boolean _delFlg;

    public MstUser(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "mst_user";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", _id);
        map.put("user_id", _userId);
        map.put("user_password", _userPassword);
        map.put("del_flg", _delFlg);
        map.put(p.sysColumnName, p.sysColumnValue);
        return map;
    }

}
