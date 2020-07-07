package com.power.ssm.common;

import com.power.ssm.model.FaultLocation;
import com.power.ssm.model.FaultReason;
import com.power.ssm.model.FaultType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Analyse {

    private Date startDate;
    private Date endDate;
    private Integer locationId;
    private Integer reasonId;
    private Integer typeId;
    private List<Location> locationList;
    private List<Type> typeList;
    private List<Reason> reasonList;
    private List<LocationType> locationTypeList;
    private List<LocationReason> locationReasonList;
    private List<TypeReason> typeReasonList;

    @Getter
    @Setter
    static public class Location {
        private Integer id;
        private FaultLocation location;
        private Integer count;
    }

    @Getter
    @Setter
    static public class Type {
        private Integer id;
        private FaultType type;
        private Integer count;
    }

    @Getter
    @Setter
    static public class Reason {
        private Integer id;
        private FaultReason reason;
        private Integer count;
    }

    @Getter
    @Setter
    static public class LocationType {
        private FaultLocation location;
        private FaultType type;
        private Integer count;
    }
    @Getter
    @Setter
    static public class LocationReason {
        private FaultLocation location;
        private FaultReason reason;
        private Integer count;
    }
    @Getter
    @Setter
    static public class TypeReason {
        private FaultType type;
        private FaultReason reason;
        private Integer count;
    }

}
