package com.power.ssm.model;

import com.power.ssm.common.Model;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
public class FaultDevice extends Model {

    private Integer id;
    // 型号
    private String model;
    // 厂家
    private String factory;
    // 年份
    private Date createdAt;

}
