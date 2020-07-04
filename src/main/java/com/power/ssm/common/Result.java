package com.power.ssm.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Result<T> {

    private Integer total;
    private Integer currentPage;
    private Integer pageSize;
    private Integer pageCount;
    private List<T> data;

    @Override
    public String toString() {
        return "Result{" +
                "total=" + total +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", data=" + data +
                '}';
    }
}
