package com.power.ssm.service;

import com.power.ssm.aop.QueryAop;
import com.power.ssm.common.Merge;
import com.power.ssm.common.Result;
import com.power.ssm.dao.FaultDao;
import com.power.ssm.model.Fault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("faultService")
public class FaultImpl implements FaultService{

    @Resource
    FaultDao faultDao;

    @Override
    public int getId(Fault recode) {
        return 0;
    }

    @QueryAop
    @Override
    public Result<Fault> query(Fault record) {
        Result<Fault> result = new Result<>();
        result.setTotal(this.faultDao.count(record));
        result.setData(this.faultDao.query(record));
        return result;
    }

    @Override
    public int insert(Fault record) {
        return this.faultDao.insert(record);
    }

    @Override
    public int insertList(List<Fault> records) {
        return this.faultDao.insertList(records);
    }

    @Override
    public int delete(Fault record) {
        return 0;
    }

    @Override
    public int update(Fault record) {
        return 0;
    }

    @Override
    public Fault select(Integer pk) {
        return null;
    }

    @Override
    public int merge(Merge merge) {
        Fault fault = new Fault();
        // 设置不分页
        fault.setPageFlag(0);
        List<Fault> faultList;
        switch (merge.getType()) {
            case "location":
                fault.setLocationId(merge.getStart());
                faultList = this.faultDao.query(fault);
                for (Fault value : faultList) {
                    value.setLocationId(merge.getEnd());
                }
                break;
            case "type":
                fault.setTypeId(merge.getStart());
                faultList = this.faultDao.query(fault);
                for (Fault value : faultList) {
                    value.setTypeId(merge.getEnd());
                }
                break;
            case "reason":
                fault.setReasonId(merge.getStart());
                faultList = this.faultDao.query(fault);
                for (Fault value : faultList) {
                    value.setReasonId(merge.getEnd());
                }
                break;
        }
        return 1;
    }
}
