package com.power.ssm.service;

import com.power.ssm.common.Result;
import com.power.ssm.dao.FaultTypeDao;
import com.power.ssm.model.FaultReason;
import com.power.ssm.model.FaultType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("faultTypeService")
public class FaultTypeImpl implements FaultTypeService{

    @Resource
    FaultTypeDao faultTypeDao;

    @Override
    public int insert(FaultType record) {
        return this.faultTypeDao.insert(record);
    }

    @Override
    public int insertList(List<FaultType> records) {
        return 0;
    }

    @Override
    public int delete(FaultType record) {
        return this.faultTypeDao.delete(record);
    }

    @Override
    public int update(FaultType record) {
        return this.faultTypeDao.update(record);
    }

    @Override
    public Result<FaultType> query(FaultType record) {
        return null;
//        return this.faultTypeDao.query(record);
    }

    @Override
    public FaultType select(Integer pk) {
        return this.faultTypeDao.select(pk);
    }

    @Override
    public int getId(FaultType record) {
        if (record == null) {
            return 0;
        }
        List<FaultType> res = this.faultTypeDao.getId(record);
        if (res == null || res.size() == 0) {
            this.faultTypeDao.insert(record);
            return record.getId();
        } else {
            return res.get(0).getId();
        }
    }
}
