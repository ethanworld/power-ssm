package com.power.ssm.common;

import com.power.ssm.model.Fault;


public interface Service<T> extends Common<T>{

    int getId(T record);

    Result<T> query(T record);


}
