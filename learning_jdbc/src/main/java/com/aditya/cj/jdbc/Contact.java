package com.aditya.cj.jdbc;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {

    private int id;
    private String name;
    private String email;
    private String mobile;
}
