package com.power.ssm.model;

import com.power.ssm.common.Model;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Calculate extends Model {

    private Double value;
    private String tableName;

}
