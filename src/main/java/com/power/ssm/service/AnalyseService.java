package com.power.ssm.service;

import com.power.ssm.common.Analyse;
import com.power.ssm.model.Fault;

public interface AnalyseService {

    Analyse get(Fault fault);

}
