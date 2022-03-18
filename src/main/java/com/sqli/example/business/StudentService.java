package com.sqli.example.business;

import com.sqli.example.models.Student;

import java.util.List;

public interface StudentService {
    public List<Student> showAllStudent();
    public boolean addStudent(Student s);
    public boolean removeStudent(int id);
    //public void updateStudent(int id ,Student);
}
