package org.example.Services;

import org.example.Repository.StudentRepository;
import org.example.dto.CreateStudentRequests;
import org.example.dto.CreateStudentsResponse;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIml implements StudentService {

    @Autowired
    private Student student;

    @Override
    public CreateStudentsResponse createStudent(CreateStudentRequests studentRequests) {
        return null;
    }
}
