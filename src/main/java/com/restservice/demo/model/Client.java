package com.restservice.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Client {

    private Integer Id;
    private String Name;
    private String email;
    private String phone;

}
