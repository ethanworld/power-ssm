package com.power.ssm.common;

import java.util.List;

public interface Common<T> {

    int insert(T record);
    int insertList(List<T> records);

    int delete(T record);

    int update(T record);

    List<T> selectAll();

    T select(Integer pk);
}