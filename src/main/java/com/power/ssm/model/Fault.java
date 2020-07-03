package com.power.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.power.ssm.common.Model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
public class Fault extends Model {

    private Integer id;
    // 省公司、地市局、区县局
    private Integer locationId;
    private FaultLocation location;
    // 所属变电站名称
    private String station;
    // 所属中压线路名称
    private String line;
    // 故障设备类别
    private Integer typeId;
    private FaultType type;
    // 故障设备电压等级
    private String voltage;
    // 故障设备发生故障的部位
    private String position;
    // 故障设备
    private Integer deviceId;
    private FaultDevice device;
    // 是否引起变电站中压馈线开关跳闸
    private String inOpen;
    // 变电站中压馈线开关跳闸是否重合成功
    private String inClose;
    // 是否引起变电站外线路开关跳闸
    private String outOpen;
    // 变电站外线路开关跳闸是否重合成功
    private String outClose;
    // 故障原因
    private Integer reasonId;
    private FaultReason reason;

    // 故障日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    // 故障描述
    private String description;
    // 备注
    private String remark;


    @Override
    public String toString() {
        return "Fault{" +
                "id=" + id +
                ", locationId=" + locationId +
                ", location=" + location +
                ", station='" + station + '\'' +
                ", line='" + line + '\'' +
                ", typeId=" + typeId +
                ", type=" + type +
                ", voltage='" + voltage + '\'' +
                ", position='" + position + '\'' +
                ", deviceId=" + deviceId +
                ", device=" + device +
                ", inOpen='" + inOpen + '\'' +
                ", inClose='" + inClose + '\'' +
                ", outOpen='" + outOpen + '\'' +
                ", outClose='" + outClose + '\'' +
                ", reasonId=" + reasonId +
                ", reason=" + reason +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
