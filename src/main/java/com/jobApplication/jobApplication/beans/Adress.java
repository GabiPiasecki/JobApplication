package com.jobApplication.jobApplication.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Adress {
    private String city;
    private String street;
    private String addressNumber;
    private String interviewLink;
    private boolean physicalInterview;
}
