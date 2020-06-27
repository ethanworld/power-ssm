package com.power.ssm.controller;

import com.power.ssm.common.Controller;
import com.power.ssm.model.FaultReason;
import com.power.ssm.service.FaultReasonService;
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
@RequestMapping("/api/reasons")
public class FaultReasonController implements Controller<FaultReason> {

    @Resource
    FaultReasonService faultReasonService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<FaultReason> query(FaultReason record) {
        return this.faultReasonService.query(record);
    }

    @Override
    public FaultReason get(Integer pk) {
        return null;
    }

    @Override
    public int post(FaultReason record) {
        return 0;
    }

    @Override
    public int put(FaultReason record) {
        return 0;
    }

    @Override
    public int delete(FaultReason record) {
        return 0;
    }
}
