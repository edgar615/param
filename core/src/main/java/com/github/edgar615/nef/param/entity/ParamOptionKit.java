package com.github.edgar615.nef.param.entity;

import com.github.edgar615.entity.PersistentKit;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

/**
* This class is generated by Jdbc code generator.
*
* Table : param_option
*
* @author Jdbc Code Generator
*/
public class ParamOptionKit implements PersistentKit<Long, ParamOption> {

    private static final long serialVersionUID = 1L;
    
    public static final String DB_PARAM_OPTION_ID = "param_option_id";
    
    public static final String DB_PARAM_DEF_ID = "param_def_id";
    
    public static final String DB_OPTION_TEXT = "option_text";
    
    public static final String DB_OPTION_VALUE = "option_value";
    
    public static final String DB_SORTED = "sorted";
    
    
    public static final String PARAM_OPTION_ID = "paramOptionId";
    
    public static final String PARAM_DEF_ID = "paramDefId";
    
    public static final String OPTION_TEXT = "optionText";
    
    public static final String OPTION_VALUE = "optionValue";
    
    public static final String SORTED = "sorted";
    
    @Override
    public List<String> fields() {
      return Lists.newArrayList(PARAM_OPTION_ID,
						PARAM_DEF_ID,
						OPTION_TEXT,
						OPTION_VALUE,
						SORTED);
    }
    
    
    @Override
    public String primaryField() {
        return PARAM_OPTION_ID;
    }

    @Override
    public void toMap(ParamOption paramOption, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        
        map.put(PARAM_OPTION_ID,  paramOption.getParamOptionId());
        map.put(PARAM_DEF_ID,  paramOption.getParamDefId());
        map.put(OPTION_TEXT,  paramOption.getOptionText());
        map.put(OPTION_VALUE,  paramOption.getOptionValue());
        map.put(SORTED,  paramOption.getSorted());
    }

    @Override
    public void fromMap(Map<String, Object> map, ParamOption paramOption) {
        if (map == null) {
            return;
        }
        if (map.get(PARAM_OPTION_ID) instanceof Long) {
            paramOption.setParamOptionId((Long) map.get(PARAM_OPTION_ID));
        }
        if (map.get(PARAM_DEF_ID) instanceof Long) {
            paramOption.setParamDefId((Long) map.get(PARAM_DEF_ID));
        }
        if (map.get(OPTION_TEXT) instanceof String) {
            paramOption.setOptionText((String) map.get(OPTION_TEXT));
        }
        if (map.get(OPTION_VALUE) instanceof Integer) {
            paramOption.setOptionValue((Integer) map.get(OPTION_VALUE));
        }
        if (map.get(SORTED) instanceof Integer) {
            paramOption.setSorted((Integer) map.get(SORTED));
        }
        
    }

   /* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/
	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/


}
