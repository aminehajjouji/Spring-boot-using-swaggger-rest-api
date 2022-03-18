package com.sqli.example.controllers;

import com.sqli.example.business.StudentService;
import com.sqli.example.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("service")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/getAll")
    public List<Student> showStudentList() {
        return service.showAllStudent();
    }

    @PostMapping(value ="/addStudent")
    public boolean addOneStudent(@RequestBody Student s) {
        System.out.println(s);
        return service.addStudent(s);
    }

    @DeleteMapping("/student/{studentId}")
     public boolean deleteStudent(@PathVariable int studentId) {
        return service.removeStudent(studentId);

    }

}
