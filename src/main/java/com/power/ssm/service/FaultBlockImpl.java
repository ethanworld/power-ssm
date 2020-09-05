package com.power.ssm.service;

import com.power.ssm.common.Result;
import com.power.ssm.dao.FaultBlockDao;
import com.power.ssm.model.FaultBlock;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("faultBlockService")
public class FaultBlockImpl implements FaultBlockService{

    @Resource
    FaultBlockDao faultBlockDao;

    @Override
    public int getId(FaultBlock record) {
        return 0;
    }

    @Override
    public Result<FaultBlock> query(FaultBlock record) {
        return null;
    }

    @Override
    public int insert(FaultBlock record) {
        return 0;
    }

    @Override
    public int insertList(List<FaultBlock> records) {
        return 0;
    }

    @Override
    public int delete(FaultBlock record) {
        return 0;
    }

    @Override
    public int update(FaultBlock record) {
        return 0;
    }

    @Override
    public FaultBlock select(Integer pk) {
        return this.faultBlockDao.select(pk);
    }
}
