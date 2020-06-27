package com.power.ssm.service;

import com.power.ssm.dao.FaultLocationDao;
import com.power.ssm.model.Fault;
import com.power.ssm.model.FaultLocation;
import com.power.ssm.model.FaultReason;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("faultLocationService")
public class FaultLocationImpl implements FaultLocationService{

    @Resource
    FaultLocationDao faultLocationDao;

    @Override
    public int getId(FaultLocation record) {
        if (record == null) {
            return 0;
        }
        List<FaultLocation> res = this.faultLocationDao.getId(record);
        if (res == null || res.size() == 0) {
            this.faultLocationDao.insert(record);
            return record.getId();
        } else {
            return res.get(0).getId();
        }
    }

    @Override
    public int insert(FaultLocation record) {
        return 0;
    }

    @Override
    public int insertList(List<FaultLocation> records) {
        return 0;
    }

    @Override
    public int delete(FaultLocation record) {
        return 0;
    }

    @Override
    public int update(FaultLocation record) {
        return 0;
    }

    @Override
    public List<FaultLocation> query(FaultLocation record) {
        return null;
    }

    @Override
    public FaultLocation select(Integer pk) {
        return null;
    }
}
