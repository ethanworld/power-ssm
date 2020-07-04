package com.power.ssm.common;


public interface Controller<T>{
    public abstract Result<T> query(T record);
    public abstract T get(Integer pk);
    public abstract int post(T record);
    public abstract int put(T record);
    public abstract int delete(T record);
}