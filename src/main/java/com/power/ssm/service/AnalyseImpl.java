package com.power.ssm.service;


import com.power.ssm.common.Analyse;
import com.power.ssm.dao.FaultDao;
import com.power.ssm.model.Fault;
import com.power.ssm.model.FaultLocation;
import com.power.ssm.model.FaultReason;
import com.power.ssm.model.FaultType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("analyseService")
public class AnalyseImpl implements AnalyseService{

    @Resource
    FaultLocationService faultLocationService;
    @Resource
    FaultTypeService faultTypeService;
    @Resource
    FaultReasonService faultReasonService;
    @Resource
    FaultDao faultDao;

    @Override
    public Analyse get (Fault fault) {

        Analyse analyse = new Analyse();
        analyse.setLocationList(new ArrayList<>());
        analyse.setTypeList(new ArrayList<>());
        analyse.setReasonList(new ArrayList<>());
        analyse.setLocationTypeList(new ArrayList<>());
        analyse.setLocationReasonList(new ArrayList<>());
        analyse.setTypeReasonList(new ArrayList<>());

        Integer locationId = fault.getLocationId();
        Integer typeId = fault.getTypeId();
        Integer reasonId = fault.getReasonId();

        List<FaultLocation> locationList = this.faultLocationService.query(null).getData();
        for (FaultLocation location :locationList) {
            fault.setReasonId(null);
            fault.setTypeId(null);
            fault.setLocationId(location.getId());
            Analyse.Location item = new Analyse.Location();
            item.setLocation(location);
            item.setCount(this.faultDao.count(fault));
            analyse.getLocationList().add(item);
        }

        List<FaultType> typeList = this.faultTypeService.query(null).getData();
        for (FaultType type :typeList) {
            fault.setReasonId(reasonId);
            fault.setLocationId(locationId);
            fault.setTypeId(type.getId());
            Analyse.Type item = new Analyse.Type();
            item.setType(type);
            item.setCount(this.faultDao.count(fault));
            analyse.getTypeList().add(item);
        }

        List<FaultReason> reasonList = this.faultReasonService.query(null).getData();
        for (FaultReason reason :reasonList) {
            fault.setTypeId(typeId);
            fault.setLocationId(locationId);
            fault.setReasonId(reason.getId());
            Analyse.Reason item = new Analyse.Reason();
            item.setReason(reason);
            item.setCount(this.faultDao.count(fault));
            analyse.getReasonList().add(item);
        }

        return analyse;

    }


}
