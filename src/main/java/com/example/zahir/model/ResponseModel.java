package com.example.zahir.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ResponseModel {
    private Integer code;
    private String message;
    private Object data;

}
