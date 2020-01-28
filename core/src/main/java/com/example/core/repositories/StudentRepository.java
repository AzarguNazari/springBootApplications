package com.example.core.repositories;

import com.example.core.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    public Optional<Student> getStudentByUsername(String username);
}
