package com.power.ssm.dao;

import com.power.ssm.common.Dao;
import com.power.ssm.model.Fault;
import com.power.ssm.model.StarQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaultDao extends Dao<Fault> {


    int count(Fault record);

    List<Fault> starQuery(StarQuery query);
}
