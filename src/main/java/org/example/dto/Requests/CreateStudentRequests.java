package org.example.dto.Requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateStudentRequests {

    private String fullName;
    private String email;
    private String phoneNumber;
}
