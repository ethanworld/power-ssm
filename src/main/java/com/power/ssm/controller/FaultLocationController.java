package com.power.ssm.controller;

import com.power.ssm.common.Controller;
import com.power.ssm.model.FaultLocation;
import com.power.ssm.service.FaultLocationService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/locations")
public class FaultLocationController implements Controller<FaultLocation> {

    @Resource
    FaultLocationService faultLocationService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<FaultLocation> query(FaultLocation record) {
        return this.faultLocationService.query(record);
    }

    @Override
    public FaultLocation get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody FaultLocation record) {
        return this.faultLocationService.insert(record);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @Override
    public int put(@RequestBody FaultLocation record) {
        return this.faultLocationService.update(record);
    }

    @Override
    public int delete(FaultLocation record) {
        return 0;
    }
}
