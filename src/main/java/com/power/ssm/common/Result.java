package com.power.ssm.common;

import java.util.List;

public class Result<T> {

    private Integer total;
    private Integer currentPage;
    private Integer pageSize;
    private List<T> data;
}
