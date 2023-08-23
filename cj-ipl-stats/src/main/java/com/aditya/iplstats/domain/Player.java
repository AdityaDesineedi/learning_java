package com.aditya.iplstats.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private String role;
    private String country;
    private String team;
    @JsonProperty("amount")  //we have given amount in json but we are taking price, so we need to include this syntax
    private double price;
}
