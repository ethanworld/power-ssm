package com.power.ssm.common;

import com.power.ssm.model.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Helper {


    public static Object parseObject(HashMap<String, String> map, Object o) {

        if (o == FaultReason.class) {
            if (map.get("reason") == null) return null;
            FaultReason reason = new FaultReason();
            reason.setReason(map.get("reason"));
            return reason;
        } else if (o == FaultType.class) {
            if (map.get("type") == null) return null;
            FaultType type = new FaultType();
            type.setType(map.get("type"));
            return type;
        } else if (o == FaultLocation.class) {
            if (map.get("province") == null && map.get("city") == null && map.get("district") == null) return null;
            FaultLocation location = new FaultLocation();
            location.setProvince(map.get("province"));
            location.setCity(map.get("city"));
            // 区县局数据清洗
            String district = map.get("district");
            location.setDistrict(district.substring(0, 2) + "局");
            return location;
        } else if (o == Fault.class) {
            Fault fault = new Fault();
            fault.setStation(map.get("station"));
            fault.setLine(map.get("line"));
            fault.setVoltage(map.get("voltage"));
            fault.setPosition(map.get("position"));
            fault.setModel(map.get("model"));
            fault.setFactory(map.get("factory"));
            if (map.get("productionDate") != null) {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                    Date date = sdf.parse(map.get("productionDate"));
                    fault.setProductionDate(date);
                } catch (ParseException ignored) {
                }
            }
            fault.setInClose(map.get("inClose"));
            fault.setInOpen(map.get("inOpen"));
            fault.setOutClose(map.get("outClose"));
            fault.setOutOpen(map.get("outOpen"));
            if (map.get("faultDate") != null) {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                    Date date = sdf.parse(map.get("faultDate"));
                    fault.setFaultDate(date);
                } catch (ParseException ignored) {
                }
            }
            fault.setDescription(map.get("description"));
            fault.setRemark(map.get("remark"));

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
                return "productionDate";
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
                return "faultDate";
            case "故障情况描述":
                return "description";
            case "备注":
                return "remark";
        }
        return null;
    }
}
