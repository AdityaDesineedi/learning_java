package com.aditya.wallet.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Wallet {
    private Long id;
    private String mobile;
    private String name;
    private double balance;

}
