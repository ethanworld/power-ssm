package com.power.ssm.controller;

import com.power.ssm.common.Controller;
import com.power.ssm.common.Result;
import com.power.ssm.model.Calculate;
import com.power.ssm.model.Calculate;
import com.power.ssm.service.CalculateService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/calculation")
public class CalculateController implements Controller<Calculate> {

    @Resource
    CalculateService calculateService;

    @RequestMapping(value = "/all/{lineId}", method = RequestMethod.GET)
    public HashMap<String, Result<Calculate>> queryAll(@PathVariable Integer lineId) {
        Calculate record = new Calculate();
        record.setLineId(lineId);
        HashMap<String, Result<Calculate>> map = new HashMap<>();
        record.setTableName("load_lost");
        map.put("load_lost", this.calculateService.query(record));
        record.setTableName("load_risk");
        map.put("load_risk", this.calculateService.query(record));
        record.setTableName("radio_lost");
        map.put("radio_lost", this.calculateService.query(record));
        record.setTableName("radio_risk");
        map.put("radio_risk", this.calculateService.query(record));
        return map;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public Result<Calculate> query(Calculate record) {
        return this.calculateService.query(record);
    }

    @Override
    public Calculate get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody Calculate record) {
        return this.calculateService.insert(record);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @Override
    public int put(@RequestBody Calculate record) {
        return this.calculateService.update(record);
    }

    @Override
    public int delete(Calculate record) {
        return 0;
    }
}
