package com.sqli.example.business;

import com.sqli.example.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Vector;

@Service
public class StudentImpl implements StudentService{
    private List<Student> list ;
    public StudentImpl() {
        list = new Vector<>();
        list.add(new Student(1,"amine","hajjouji","0639808596"));
        list.add(new Student(2,"zaki","hajjouji","06398569287"));
        list.add(new Student(3,"mehdi","hajjouji","0368216982"));
    }

    public List<Student> showAllStudent() {
        return list;
    }

    @Override
    public boolean addStudent(Student s) {
        if (list.add(s)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removeStudent(int id) {
        for (Student s:list
             ) {
            if(s.getId() == id ){
                return list.remove(s);
            }
        }
      return false;
    }
}
