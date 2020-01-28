package com.example.core.controllers;

import com.example.core.Model.Student;
import com.example.core.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{username}")
    public ResponseEntity getStudent(@PathVariable(name = "username") String username){
        Optional<Student> student = studentService.getStudentByUsername(username);
        if(student.isPresent()){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student.get(), HttpStatus.OK);
    }

    @GetMapping("test/{something}")
    public String getString(@PathVariable String something){
        return something;
    }

}
