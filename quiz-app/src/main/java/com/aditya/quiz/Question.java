package com.aditya.quiz;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Question {
    private int id;
    private String questionData;
    private List<String> options;
    private int answer;
}
