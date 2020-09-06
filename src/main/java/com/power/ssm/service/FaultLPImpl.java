package com.power.ssm.service;

import com.power.ssm.common.Result;
import com.power.ssm.dao.FaultLPDao;
import com.power.ssm.model.FaultLP;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("faultLPService")
public class FaultLPImpl implements FaultLPService{

    @Resource
    FaultLPDao faultLPDao;

    @Override
    public int getId(FaultLP record) {
        return 0;
    }

    @Override
    public Result<FaultLP> query(FaultLP record) {
        return null;
    }

    @Override
    public int insert(FaultLP record) {
        return 0;
    }

    @Override
    public int insertList(List<FaultLP> records) {
        return 0;
    }

    @Override
    public int delete(FaultLP record) {
        return 0;
    }

    @Override
    public int update(FaultLP record) {
        return 0;
    }

    @Override
    public FaultLP select(Integer pk) {
        return this.faultLPDao.select(pk);
    }
}
