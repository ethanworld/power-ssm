package com.power.ssm.common;

import java.util.List;

public interface Dao<T> extends Common<T>{

    List<T> getId(T recode);

    List<T> query(T record);
}
