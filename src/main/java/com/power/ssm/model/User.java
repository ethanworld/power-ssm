package com.power.ssm.model;

import com.power.ssm.common.Model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends Model {

    private String username;
    private String password;

}
