package com.power.ssm.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Merge {

    private String type;
    private Integer start;
    private Integer end;

    @Override
    public String toString() {
        return "Merge{" +
                "type='" + type + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
