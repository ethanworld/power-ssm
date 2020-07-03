package com.power.ssm.controller;

import com.power.ssm.common.Controller;
import com.power.ssm.model.FaultType;
import com.power.ssm.service.FaultTypeService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/types")
public class FaultTypeController implements Controller<FaultType> {

    @Resource
    FaultTypeService faultTypeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<FaultType> query(FaultType record) {
        return this.faultTypeService.query(record);
    }

    @Override
    public FaultType get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody FaultType record) {
        return this.faultTypeService.insert(record);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @Override
    public int put(@RequestBody FaultType record) {
        return this.faultTypeService.update(record);
    }

    @Override
    public int delete(FaultType record) {
        return 0;
    }
}
