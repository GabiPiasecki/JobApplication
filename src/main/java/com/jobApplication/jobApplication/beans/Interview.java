package com.jobApplication.jobApplication.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

import java.time.LocalDateTime;


@NoArgsConstructor
@Data
public class Interview {
    private LocalDateTime interviewTime;
    private Address address;
    private ContactPerson person;
    private String additionalComments;
    private int interviewNumber;
    private boolean reminder;
    private String JobApplicationId;
}
