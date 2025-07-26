package com.ecom.SpringsSecurity.service;

import com.ecom.SpringsSecurity.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"Devesh", 70),
            new Student(2,"Pawan", 60)
    ));

    public List<Student> getStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }
}
