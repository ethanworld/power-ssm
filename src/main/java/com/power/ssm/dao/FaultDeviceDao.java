package com.power.ssm.dao;

import com.power.ssm.common.Dao;
import com.power.ssm.model.FaultDevice;
import com.power.ssm.model.FaultLocation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FaultDeviceDao extends Dao<FaultDevice> {

}
