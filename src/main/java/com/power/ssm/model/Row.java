package com.power.ssm.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Row {

    // 省公司、地市局、区县局
    private String province;
    private String city;
    private String district;
    // 所属变电站名称
    private String station;
    // 所属中压线路名称
    private String line;
    // 故障设备类别
    private String type;
    // 故障设备电压等级
    private String voltage;
    // 故障设备发生故障的部位
    private String position;
    // 型号、厂家、年份
    private String model;
    private String factory;
    private String createdAt;
    // 是否引起变电站中压馈线开关跳闸
    private String inOpen;
    // 变电站中压馈线开关跳闸是否重合成功
    private String inClose;
    // 是否引起变电站外线路开关跳闸
    private String outOpen;
    // 变电站外线路开关跳闸是否重合成功
    private String outClose;
    private String reason;
    // 故障日期
    private String date;
    // 故障描述
    private String description;
    // 备注
    private String remark;

    @Override
    public String toString() {
        return "Raw{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", station='" + station + '\'' +
                ", line='" + line + '\'' +
                ", type='" + type + '\'' +
                ", voltage='" + voltage + '\'' +
                ", position='" + position + '\'' +
                ", model='" + model + '\'' +
                ", factory='" + factory + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", inOpen='" + inOpen + '\'' +
                ", inClose='" + inClose + '\'' +
                ", outOpen='" + outOpen + '\'' +
                ", outClose='" + outClose + '\'' +
                ", reason='" + reason + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
