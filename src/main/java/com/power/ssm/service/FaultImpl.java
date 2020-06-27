package com.power.ssm.service;

import com.power.ssm.dao.FaultDao;
import com.power.ssm.model.Fault;
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
    public List<Fault> query(Fault record) {
        return this.faultDao.query(record);
    }

    @Override
    public Fault select(Integer pk) {
        return null;
    }
}
