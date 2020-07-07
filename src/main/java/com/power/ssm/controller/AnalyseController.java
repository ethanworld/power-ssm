package com.power.ssm.controller;

import com.power.ssm.common.Analyse;
import com.power.ssm.model.Fault;
import com.power.ssm.service.AnalyseService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/analyses")
public class AnalyseController {

    @Resource
    AnalyseService analyseService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    Analyse get(Fault fault) {
        return this.analyseService.get(fault);
    }

}
