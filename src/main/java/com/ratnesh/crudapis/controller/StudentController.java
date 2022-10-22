package com.ratnesh.crudapis.controller;

import com.ratnesh.crudapis.repo.StudentRepo;
import com.ratnesh.crudapis.studentmodel.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/students")
    public List<Student> showStudents() {
        return repo.findAll();
    }

    @PostMapping("/student")
    public Student addStudent(Student student) {
        repo.save(student);
        return student;
    }

    @GetMapping("/student/{roll}")
    public Optional<Student> getStudent(@PathVariable("roll") int roll) {
        return repo.findById(roll);
    }

    @PutMapping("/student")
    public Student updateStudent(Student student) {
        repo.save(student);
        return student;
    }

    @DeleteMapping("/student/{roll}")
    public List<Student> deleteStudent(@PathVariable("roll") int roll) {
        Student deleteStudent = repo.getReferenceById(roll);
        repo.delete(deleteStudent);
        return repo.findAll();
    }
}
