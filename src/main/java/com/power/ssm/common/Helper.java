package com.power.ssm.common;

import com.alibaba.fastjson.JSONObject;
import com.power.ssm.model.*;

import java.util.HashMap;

public class Helper {


    public static Object parseObject(HashMap<String, String> map, Object o) {

        if (o == FaultReason.class) {
            FaultReason reason = new FaultReason();
            reason.setReason(map.get("reason"));
            return reason;
        } else if (o == FaultType.class) {
            FaultType type = new FaultType();
            type.setType(map.get("type"));
            return type;
        } else if (o == FaultLocation.class) {
            FaultLocation location = new FaultLocation();
            location.setProvince(map.get("province"));
            location.setCity(map.get("city"));
            location.setDistrict(map.get("district"));
            return location;
        } else if (o == FaultDevice.class) {
            FaultDevice device = new FaultDevice();
            device.setModel(map.get("model"));
            device.setFactory(map.get("factory"));
//            device.setCreatedAt(map.get("createdAt"));
            return device;
        } else if (o == Fault.class) {
            Fault fault = new Fault();
            fault.setStation(map.get("station"));
            fault.setLine(map.get("line"));
            fault.setVoltage(map.get("voltage"));
            fault.setPosition(map.get("position"));
//            fault.setDate(map.get("description"));
            fault.setDescription(map.get("description"));
            fault.setRemark(map.get("description"));
            fault.setInOpen(0);
            if (map.get("inOpen").equals("是")) {
                fault.setInOpen(1);
            }
            fault.setInClose(0);
            if (map.get("inClose").equals("是")) {
                fault.setInClose(1);
            }
            fault.setOutOpen(0);
            if (map.get("outOpen").equals("是")) {
                fault.setOutOpen(1);
            }
            fault.setOutClose(0);
            if (map.get("outClose").equals("是")) {
                fault.setOutClose(1);
            }
            return fault;
        }

        return null;
    }



    /**
     * 根据中文匹配英文字段
     * @param cn 输入中文
     * @return 返回英文
     */
    public static String transfer (String cn) {
        switch (cn) {
            case "省公司":
                return "province";
            case "地市局":
                return "city";
            case "县区局":
                return "district";
            case "所属变电站名称":
                return "station";
            case "所属中压线路名称":
                return "line";
            case "故障设备类别":
                return "type";
            case "故障设备电压等级":
                return "voltage";
            case "故障设备发生故障的部位":
                return "position";
            case "设备型号":
                return "model";
            case "生产厂家":
                return "factory";
            case "生产年份":
                return "createdAt";
            case "是否引起变电站中压馈线开关跳闸":
                return "inOpen";
            case "变电站中压馈线开关跳闸是否重合成功":
                return "inClose";
            case "是否引起变电站外线路开关跳闸":
                return "outOpen";
            case "变电站外线路开关跳闸是否重合成功":
                return "outClose";
            case "故障原因归类":
                return "reason";
            case "故障日期":
                return "date";
            case "故障情况描述":
                return "description";
            case "备注":
                return "remark";
        }
        return null;
    }
}
