package com.github.edgar615.nef.param.dao.impl;

import com.github.edgar615.dao.BaseDaoImpl;
import com.github.edgar615.jdbc.Jdbc;
import com.github.edgar615.nef.param.dao.ParamGroupDao;
import com.github.edgar615.nef.param.entity.ParamGroup;
import org.springframework.stereotype.Service;

/**
* This class is generated by Jdbc code generator.
*
* Table : param_group
*
* @author Jdbc Code Generator
*/
@Service
public class ParamGroupDaoImpl extends BaseDaoImpl<Long, ParamGroup> implements ParamGroupDao {
    
    public ParamGroupDaoImpl(Jdbc jdbc) {
        super(ParamGroup.class, jdbc);
    }
    

    /* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/
	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/
}
