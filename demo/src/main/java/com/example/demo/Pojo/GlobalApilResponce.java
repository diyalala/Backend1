package com.example.demo.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class GlobalApilResponce<T>{
    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public Integer status;
    private String message;
    private String data;
    private T data;
}
