package com.power.ssm.model;

import com.power.ssm.common.Model;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FaultLocation extends Model {

    private Integer id;
    private Integer index;
    private Integer flag;
    private String province;
    private String city;
    private String district;
}
