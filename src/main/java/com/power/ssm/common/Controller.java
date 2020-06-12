package com.power.ssm.common;

import java.util.List;

public interface Controller<T>{
    public abstract List<T> getList();
    public abstract T get(Integer pk);
    public abstract int post(T record);
    public abstract int put(T record);
    public abstract int delete(T record);
}