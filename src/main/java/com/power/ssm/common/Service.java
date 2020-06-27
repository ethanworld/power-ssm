package com.power.ssm.common;

public interface Service<T> extends Common<T>{

    int getId(T record);
}
