package com.power.ssm.dao;

import com.power.ssm.common.Dao;
import com.power.ssm.model.FaultReason;
import com.power.ssm.model.FaultType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FaultReasonDao extends Dao<FaultReason> {

}
