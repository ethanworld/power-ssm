package com.power.ssm.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
public class Query {

    public static final Integer CURRENT_PAGE = 1;
    public static final Integer PAGE_SIZE = 100;
    public static final String CREATED_SORT = "desc";
    public static final String UPDATED_SORT = "desc";

    public Integer start; // 开始
    public Integer pageSize;
    public Integer currentPage;
    public Integer pageFlag;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date startDate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date endDate;
}
