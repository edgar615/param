package com.github.edgar615.nef.param.entity;

import com.github.edgar615.entity.Persistent;
import com.google.common.base.MoreObjects;

/**
* This class is generated by Jdbc code generator.
*
* Table : param_def
* remarks: type: 1-整数 2-字符串 3-布尔 4-浮点数 5-单选选项 6-多选选项 7-日期 8-时间 9-日期时间 1
*
* @author Jdbc Code Generator
*/
public class ParamDef implements Persistent<Long> {

    private static final long serialVersionUID = -3830789636972488349L;
    
    /**
    * Column : param_def_id
    * remarks: 属性id
    * default: 
    * isNullable: false
    * isAutoInc: true
    * isPrimary: true
    * type: -5
    * size: 19
    */
    private Long paramDefId;
    
    /**
    * Column : param_group_id
    * remarks: 参数分组id
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long paramGroupId;
    
    /**
    * Column : type
    * remarks: 类型
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -6
    * size: 3
    */
    private Integer type;
    
    /**
    * Column : name
    * remarks: 名称
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 12
    * size: 32
    */
    private String name;
    
    /**
    * Column : alias
    * remarks: 别名
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 12
    * size: 32
    */
    private String alias;
    
    /**
    * Column : regex
    * remarks: 正则表达式
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 12
    * size: 255
    */
    private String regex;
    
    /**
    * Column : min_length
    * remarks: 最小长度
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 4
    * size: 10
    */
    private Integer minLength;
    
    /**
    * Column : max_length
    * remarks: 最大长度
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 4
    * size: 10
    */
    private Integer maxLength;
    
    /**
    * Column : precision_value
    * remarks: 精度
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 4
    * size: 10
    */
    private Integer precisionValue;
    
    /**
    * Column : min_value
    * remarks: 最小值
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long minValue;
    
    /**
    * Column : max_value
    * remarks: 最大值
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long maxValue;
    
    /**
    * Column : possible_values
    * remarks: 可能的值
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 12
    * size: 2048
    */
    private String possibleValues;
    
    /**
    * Column : default_value
    * remarks: 默认值
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 12
    * size: 128
    */
    private String defaultValue;
    
    public Long getParamDefId() {
        return paramDefId;
    }

    public void setParamDefId(Long paramDefId) {
        this.paramDefId = paramDefId;
    }
    
    public Long getParamGroupId() {
        return paramGroupId;
    }

    public void setParamGroupId(Long paramGroupId) {
        this.paramGroupId = paramGroupId;
    }
    
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
    
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }
    
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }
    
    public Integer getPrecisionValue() {
        return precisionValue;
    }

    public void setPrecisionValue(Integer precisionValue) {
        this.precisionValue = precisionValue;
    }
    
    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }
    
    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }
    
    public String getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(String possibleValues) {
        this.possibleValues = possibleValues;
    }
    
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper("ParamDef")
            .add("paramDefId",  paramDefId)
            .add("paramGroupId",  paramGroupId)
            .add("type",  type)
            .add("name",  name)
            .add("alias",  alias)
            .add("regex",  regex)
            .add("minLength",  minLength)
            .add("maxLength",  maxLength)
            .add("precisionValue",  precisionValue)
            .add("minValue",  minValue)
            .add("maxValue",  maxValue)
            .add("possibleValues",  possibleValues)
            .add("defaultValue",  defaultValue)
           .toString();
    }

    @Override
    public Long id () {
    return paramDefId;
    }

    @Override
    public void setId(Long id) {
        this.paramDefId = id;
    }

    @Override
    public void setGeneratedKey(Number key) {
    
        this.paramDefId = key.longValue();
    
    }

   /* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/
	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/


}
