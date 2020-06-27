package com.power.ssm.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FaultLocation {

    private Integer id;
    private String province;
    private String city;
    private String district;
}
