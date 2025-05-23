package org.example.Services;

import org.example.dto.CreateStudentRequests;
import org.example.dto.CreateStudentsResponse;

public interface StudentService {
    CreateStudentsResponse createStudent(CreateStudentRequests studentRequests);
}
