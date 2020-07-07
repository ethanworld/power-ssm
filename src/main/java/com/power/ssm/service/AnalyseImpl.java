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
import java.util.HashMap;
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
            fault.setReasonId(null);
            fault.setLocationId(null);
            fault.setTypeId(type.getId());
            Analyse.Type item = new Analyse.Type();
            item.setType(type);
            item.setCount(this.faultDao.count(fault));
            analyse.getTypeList().add(item);
        }

        List<FaultReason> reasonList = this.faultReasonService.query(null).getData();
        for (FaultReason reason :reasonList) {
            fault.setTypeId(null);
            fault.setLocationId(null);
            fault.setReasonId(reason.getId());
            Analyse.Reason item = new Analyse.Reason();
            item.setReason(reason);
            item.setCount(this.faultDao.count(fault));
            analyse.getReasonList().add(item);
        }

        for (FaultLocation location : locationList) {
            for (FaultType type : typeList) {
                fault.setReasonId(null);
                fault.setTypeId(type.getId());
                fault.setLocationId(location.getId());
                Analyse.LocationType item = new Analyse.LocationType();
                item.setLocation(location);
                item.setType(type);
                item.setCount(this.faultDao.count(fault));
                analyse.getLocationTypeList().add(item);
            }
        }

        for (FaultLocation location : locationList) {
            for (FaultReason reason : reasonList) {
                fault.setTypeId(null);
                fault.setReasonId(reason.getId());
                fault.setLocationId(location.getId());
                Analyse.LocationReason item = new Analyse.LocationReason();
                item.setLocation(location);
                item.setReason(reason);
                item.setCount(this.faultDao.count(fault));
                analyse.getLocationReasonList().add(item);
            }
        }
        for (FaultType type : typeList) {
            for (FaultReason reason : reasonList) {
                fault.setTypeId(type.getId());
                fault.setReasonId(reason.getId());
                fault.setLocationId(null);
                Analyse.TypeReason item = new Analyse.TypeReason();
                item.setType(type);
                item.setReason(reason);
                item.setCount(this.faultDao.count(fault));
                analyse.getTypeReasonList().add(item);
            }
        }

        return analyse;

    }


}
