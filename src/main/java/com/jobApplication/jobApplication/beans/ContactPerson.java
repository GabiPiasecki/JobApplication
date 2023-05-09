package com.jobApplication.jobApplication.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContactPerson {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private ContactType contactType;
    private boolean interviewing;
}
