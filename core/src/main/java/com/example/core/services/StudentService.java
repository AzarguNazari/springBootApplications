package com.example.core.services;

import com.example.core.Model.Student;
import com.example.core.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> getStudentByUsername(String username){
        return studentRepository.getStudentByUsername(username);
    }

}
