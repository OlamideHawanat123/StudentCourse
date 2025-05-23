package org.example.Services;

import org.example.dto.CreateStudentRequests;
import org.example.dto.CreateStudentsResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImlTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testThatStudentCanRegister() {
        CreateStudentRequests studentRequests = new CreateStudentRequests();
        studentRequests.setEmail("mumuola@gmail.com");
        studentRequests.setFullName("Mumuola");
        studentRequests.setPhoneNumber("090123456789");
        CreateStudentsResponse response = studentService.createStudent(studentRequests);
        assertNotNull(response);
        assertEquals("student account created successfully", response.getMessage());

    }

}