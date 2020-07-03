package com.power.ssm.model;

import com.power.ssm.common.Model;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FaultReason extends Model {

    private Integer id;
    private Integer index;
    private Integer flag;
    private String reason;

}
