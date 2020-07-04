package com.power.ssm.service;

import com.power.ssm.common.Result;
import com.power.ssm.dao.FaultReasonDao;
import com.power.ssm.dao.FaultTypeDao;
import com.power.ssm.model.FaultLocation;
import com.power.ssm.model.FaultReason;
import com.power.ssm.model.FaultType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("faultReasonService")
public class FaultReasonImpl implements FaultReasonService{

    @Resource
    FaultReasonDao faultReasonDao;

    @Override
    public int getId(FaultReason record) {
        if (record == null) {
            return 0;
        }
        List<FaultReason> res = this.faultReasonDao.getId(record);
        if (res == null || res.size() == 0) {
            this.faultReasonDao.insert(record);
            return record.getId();
        } else {
            return res.get(0).getId();
        }
    }

    @Override
    public int insert(FaultReason record) {
        return this.faultReasonDao.insert(record);
    }

    @Override
    public int insertList(List<FaultReason> records) {
        return 0;
    }

    @Override
    public int delete(FaultReason record) {
        return this.faultReasonDao.delete(record);
    }

    @Override
    public int update(FaultReason record) {
        return this.faultReasonDao.update(record);
    }

    @Override
    public Result<FaultReason> query(FaultReason record) {
        return null;
//        return this.faultReasonDao.query(record);
    }

    @Override
    public FaultReason select(Integer pk) {
        return this.faultReasonDao.select(pk);
    }
}
