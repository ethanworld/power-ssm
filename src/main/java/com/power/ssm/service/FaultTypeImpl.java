package com.power.ssm.service;

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
        return 0;
    }

    @Override
    public int insertList(List<FaultType> records) {
        return 0;
    }

    @Override
    public int delete(FaultType record) {
        return 0;
    }

    @Override
    public int update(FaultType record) {
        return 0;
    }

    @Override
    public List<FaultType> query(FaultType record) {
        return null;
    }

    @Override
    public FaultType select(Integer pk) {
        return null;
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
