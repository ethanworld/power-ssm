package com.power.ssm.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Fault {

    // 省公司、地市局、区县局
    private Integer locationId;
    private Location location;
    // 所属变电站名称
    private String station;
    // 所属中压线路名称
    private String line;
    // 故障设备类别
    private FaultType type;
    // 故障设备
    private Integer deviceId;
    private Device device;
    // 故障原因
    private Integer reasonId;
    private FaultReason reason;
    // 故障日期
    private Date date;
    // 故障描述
    private String description;


}
