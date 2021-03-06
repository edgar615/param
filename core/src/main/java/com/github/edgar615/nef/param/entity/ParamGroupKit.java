package com.github.edgar615.nef.param.entity;

import com.github.edgar615.entity.PersistentKit;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

/**
* This class is generated by Jdbc code generator.
*
* Table : param_group
*
* @author Jdbc Code Generator
*/
public class ParamGroupKit implements PersistentKit<Long, ParamGroup> {

    private static final long serialVersionUID = 1L;
    
    public static final String DB_PARAM_GROUP_ID = "param_group_id";
    
    public static final String DB_TYPE = "type";
    
    public static final String DB_NAME = "name";
    
    public static final String DB_ALIAS = "alias";
    
    public static final String DB_SORTED = "sorted";
    
    public static final String DB_CREATE_TIME = "create_time";
    
    public static final String DB_UPDATE_TIME = "update_time";
    
    
    public static final String PARAM_GROUP_ID = "paramGroupId";
    
    public static final String TYPE = "type";
    
    public static final String NAME = "name";
    
    public static final String ALIAS = "alias";
    
    public static final String SORTED = "sorted";
    
    public static final String CREATE_TIME = "createTime";
    
    public static final String UPDATE_TIME = "updateTime";
    
    @Override
    public List<String> fields() {
      return Lists.newArrayList(PARAM_GROUP_ID,
						TYPE,
						NAME,
						ALIAS,
						SORTED,
						CREATE_TIME,
						UPDATE_TIME);
    }
    
    
    @Override
    public String primaryField() {
        return PARAM_GROUP_ID;
    }

    @Override
    public void toMap(ParamGroup paramGroup, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        
        map.put(PARAM_GROUP_ID,  paramGroup.getParamGroupId());
        map.put(TYPE,  paramGroup.getType());
        map.put(NAME,  paramGroup.getName());
        map.put(ALIAS,  paramGroup.getAlias());
        map.put(SORTED,  paramGroup.getSorted());
        map.put(CREATE_TIME,  paramGroup.getCreateTime());
        map.put(UPDATE_TIME,  paramGroup.getUpdateTime());
    }

    @Override
    public void fromMap(Map<String, Object> map, ParamGroup paramGroup) {
        if (map == null) {
            return;
        }
        if (map.get(PARAM_GROUP_ID) instanceof Long) {
            paramGroup.setParamGroupId((Long) map.get(PARAM_GROUP_ID));
        }
        if (map.get(TYPE) instanceof Integer) {
            paramGroup.setType((Integer) map.get(TYPE));
        }
        if (map.get(NAME) instanceof String) {
            paramGroup.setName((String) map.get(NAME));
        }
        if (map.get(ALIAS) instanceof String) {
            paramGroup.setAlias((String) map.get(ALIAS));
        }
        if (map.get(SORTED) instanceof Integer) {
            paramGroup.setSorted((Integer) map.get(SORTED));
        }
        if (map.get(CREATE_TIME) instanceof Long) {
            paramGroup.setCreateTime((Long) map.get(CREATE_TIME));
        }
        if (map.get(UPDATE_TIME) instanceof Long) {
            paramGroup.setUpdateTime((Long) map.get(UPDATE_TIME));
        }
        
    }

   /* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/
	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/


}
