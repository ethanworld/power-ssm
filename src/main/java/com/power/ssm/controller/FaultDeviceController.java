package com.power.ssm.controller;

import com.power.ssm.common.Controller;
import com.power.ssm.model.Fault;
import com.power.ssm.model.FaultDevice;
import com.power.ssm.service.FaultDeviceService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/devices")
public class FaultDeviceController implements Controller<FaultDevice> {

    @Resource
    FaultDeviceService faultDeviceService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<FaultDevice> query(FaultDevice record) {
        return this.faultDeviceService.query(record);
    }

    @Override
    public FaultDevice get(Integer pk) {
        return null;
    }

    @Override
    public int post(FaultDevice record) {
        return 0;
    }

    @Override
    public int put(FaultDevice record) {
        return 0;
    }

    @Override
    public int delete(FaultDevice record) {
        return 0;
    }
}
