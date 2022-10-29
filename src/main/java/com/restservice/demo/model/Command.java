package com.restservice.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class Command {

    private String name;
    private double x;
    private double y;
    private Date date;
    private byte counts_try;
    private Client client;

}
