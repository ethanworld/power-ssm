package com.power.ssm.dao;

import com.power.ssm.common.Dao;
import com.power.ssm.model.Fault;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FaultDao extends Dao<Fault> {


    int count(Fault record);

}
