package com.github.edgar615.nef.param.entity;

import com.github.edgar615.entity.Persistent;
import com.google.common.base.MoreObjects;

/**
* This class is generated by Jdbc code generator.
*
* Table : param_value
* remarks: 平台参数、个人平台参数、群组平台参数的应用ID&#x3D;-1，平台参数、应用参数的主体ID&#x3D;-1，个人参数的主体ID&#x3D;用户ID，
*
* @author Jdbc Code Generator
*/
public class ParamValue implements Persistent<Long> {

    private static final long serialVersionUID = -3504249689379126556L;
    
    /**
    * Column : param_value_id
    * remarks: 参数值id
    * default: 
    * isNullable: false
    * isAutoInc: false
    * isPrimary: true
    * type: -5
    * size: 19
    */
    private Long paramValueId;
    
    /**
    * Column : param_def_id
    * remarks: 属性id
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long paramDefId;
    
    /**
    * Column : param_value
    * remarks: 参数值
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: 12
    * size: 1024
    */
    private String paramValue;
    
    /**
    * Column : application_id
    * remarks: 应用id
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long applicationId;
    
    /**
    * Column : subject_id
    * remarks: 主体id
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long subjectId;
    
    /**
    * Column : create_time
    * remarks: 创建时间
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long createTime;
    
    /**
    * Column : update_time
    * remarks: 修改时间
    * default: 
    * isNullable: true
    * isAutoInc: false
    * isPrimary: false
    * type: -5
    * size: 19
    */
    private Long updateTime;
    
    public Long getParamValueId() {
        return paramValueId;
    }

    public void setParamValueId(Long paramValueId) {
        this.paramValueId = paramValueId;
    }
    
    public Long getParamDefId() {
        return paramDefId;
    }

    public void setParamDefId(Long paramDefId) {
        this.paramDefId = paramDefId;
    }
    
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
    
    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
    
    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }
    
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
    
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper("ParamValue")
            .add("paramValueId",  paramValueId)
            .add("paramDefId",  paramDefId)
            .add("paramValue",  paramValue)
            .add("applicationId",  applicationId)
            .add("subjectId",  subjectId)
            .add("createTime",  createTime)
            .add("updateTime",  updateTime)
           .toString();
    }

    @Override
    public Long id () {
    return paramValueId;
    }

    @Override
    public void setId(Long id) {
        this.paramValueId = id;
    }

    @Override
    public void setGeneratedKey(Number key) {
    
        this.paramValueId = key.longValue();
    
    }

   /* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/
	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/
}
