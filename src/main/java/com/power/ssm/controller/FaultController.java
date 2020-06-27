package com.power.ssm.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.power.ssm.common.Controller;
import com.power.ssm.common.Helper;
import com.power.ssm.model.*;
import com.power.ssm.service.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/faults")
public class FaultController implements Controller<Fault> {

    @Resource
    FaultService faultService;
    @Resource
    FaultTypeService faultTypeService;
    @Resource
    FaultDeviceService faultDeviceService;
    @Resource
    FaultLocationService faultLocationService;
    @Resource
    FaultReasonService faultReasonService;


    @RequestMapping(value = "/batch", method = RequestMethod.POST)
    public int batch(@RequestBody String record) {
        JSONArray jsonObject = JSONArray.parseArray(record);
        ArrayList<Fault> faultArrayList = new ArrayList<>();
        for (int i = 0; i <jsonObject.size(); i++) {
            JSONObject json = jsonObject.getJSONObject(i);
            HashMap<String, String> map = new HashMap<>();
            for(Map.Entry<String, Object> entry : json.entrySet()) {
//                System.out.println(Helper.transfer(entry.getKey()) + ": " + entry.getValue());
                map.put(Helper.transfer(entry.getKey()), String.valueOf(entry.getValue()));
            }
            Fault fault = (Fault) Helper.parseObject(map, Fault.class);
            FaultReason reason = (FaultReason) Helper.parseObject(map, FaultReason.class);
            FaultType type = (FaultType) Helper.parseObject(map, FaultType.class);
            FaultLocation location = (FaultLocation) Helper.parseObject(map, FaultLocation.class);
            FaultDevice device = (FaultDevice) Helper.parseObject(map, FaultDevice.class);
            int id = this.faultTypeService.getId(type);
            fault.setTypeId(id == 0 ? null : id);
            id = this.faultDeviceService.getId(device);
            fault.setDeviceId(id == 0 ? null : id);
            id = this.faultReasonService.getId(reason);
            fault.setReasonId(id == 0 ? null : id);
            id = this.faultLocationService.getId(location);
            fault.setLocationId(id == 0 ? null : id);
            faultArrayList.add(fault);
//            this.faultService.insert(fault);
        }
        int index = 0;
        int size = faultArrayList.size();
        while (index < size) {
            this.faultService.insertList(faultArrayList.subList(index, Math.min(index + 100, size)));
            index = index + 100;
        }
        return 0;
    }


    @Override
    public List<Fault> getList() {
        return null;
    }

    @Override
    public Fault get(Integer pk) {
        return null;
    }

    @Override
    public int post(Fault record) {
        return 0;
    }

    @Override
    public int put(Fault record) {
        return 0;
    }

    @Override
    public int delete(Fault record) {
        return 0;
    }
}
