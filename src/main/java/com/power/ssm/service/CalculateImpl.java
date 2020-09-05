package com.power.ssm.service;

import com.power.ssm.common.Result;
import com.power.ssm.dao.CalculateDao;
import com.power.ssm.model.Calculate;
import com.power.ssm.model.Fault;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("calculateService")
public class CalculateImpl implements CalculateService{

    @Resource
    CalculateDao calculateDao;

    @Override
    public int getId(Calculate record) {
        return 0;
    }

    @Override
    public Result<Calculate> query(Calculate record) {
        Result<Calculate> result = new Result<>();
        result.setTotal(8);
        result.setData(this.calculateDao.query(record));
        return result;
    }

    @Override
    public int insert(Calculate record) {
        return 0;
    }

    @Override
    public int insertList(List<Calculate> records) {
        return 0;
    }

    @Override
    public int delete(Calculate record) {
        return 0;
    }

    @Override
    public int update(Calculate record) {
        return 0;
    }

    @Override
    public Calculate select(Integer pk) {
        return null;
    }
}
