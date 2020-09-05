package com.power.ssm.service;

import com.power.ssm.common.Merge;
import com.power.ssm.common.Result;
import com.power.ssm.common.Service;
import com.power.ssm.model.Fault;
import com.power.ssm.model.StarQuery;

import java.util.List;


public interface FaultService extends Service<Fault> {

    int merge(Merge merge);

    List<Fault> starQuery(StarQuery query);
}
