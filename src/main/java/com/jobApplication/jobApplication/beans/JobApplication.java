package com.jobApplication.jobApplication.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class JobApplication {

    private String id;
    private String positionName;
    private LocalDateTime sentDate;
    private ContactPerson contactPerson;
    private Company company;
    private List<String> technologies;
    private String additionalComments;
    private List<Interview> interviews;
    private Boolean continuingProcess;
    private String userId;

    public JobApplication addInterView(Interview interview) {
        if (interviews.isEmpty()) {
            interviews = new ArrayList<>();
        }
        interview.setInterviewNumber(this.interviews.size()+1);
        interview.setJobApplicationId(this.id);
        this.interviews.add(interview);
        this.continuingProcess = Boolean.TRUE;
        return this;
    }


}
