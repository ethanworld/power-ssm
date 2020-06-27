package com.power.ssm.service;

import com.power.ssm.dao.FaultDeviceDao;
import com.power.ssm.model.FaultDevice;
import com.power.ssm.model.FaultLocation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("faultDeviceService")
public class FaultDeviceImpl implements FaultDeviceService{

    @Resource
    FaultDeviceDao faultDeviceDao;

    @Override
    public int getId(FaultDevice record) {
        if (record == null) {
            return 0;
        }
        List<FaultDevice> res = this.faultDeviceDao.getId(record);
        if (res == null || res.size() == 0) {
            this.faultDeviceDao.insert(record);
            return record.getId();
        } else {
            return res.get(0).getId();
        }
    }

    @Override
    public int insert(FaultDevice record) {
        return 0;
    }

    @Override
    public int insertList(List<FaultDevice> records) {
        return 0;
    }

    @Override
    public int delete(FaultDevice record) {
        return 0;
    }

    @Override
    public int update(FaultDevice record) {
        return 0;
    }

    @Override
    public List<FaultDevice> selectAll() {
        return null;
    }

    @Override
    public FaultDevice select(Integer pk) {
        return null;
    }
}
