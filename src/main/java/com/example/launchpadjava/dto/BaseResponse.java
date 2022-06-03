package com.example.launchpadjava.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse <T>{
    private boolean status;
    private String message;
    private T data;
}
