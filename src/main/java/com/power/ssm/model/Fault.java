package com.power.ssm.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Fault {

    // 省公司、地市局、区县局
    private Integer locationId;
    private FaultLocation location;
    // 所属变电站名称
    private String station;
    // 所属中压线路名称
    private String line;
    // 故障设备类别
    private FaultType type;
    // 故障设备电压等级
    private String voltage;
    // 故障设备发生故障的部位
    private String position;
    // 故障设备
    private Integer deviceId;
    private FaultDevice device;
    // 故障原因
    private Integer reasonId;
    private FaultReason reason;
    // 故障日期
    private Date date;
    // 故障描述
    private String description;
    // 备注
    private String remark;

    // 是否引起变电站中压馈线开关跳闸
    private Integer inOpen;
    // 变电站中压馈线开关跳闸是否重合成功
    private Integer inClose;
    // 是否引起变电站外线路开关跳闸
    private Integer outOpen;
    // 变电站外线路开关跳闸是否重合成功
    private Integer outClose;

}
