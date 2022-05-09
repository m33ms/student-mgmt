package com.javaproj.studentmanagementsys.sms.service;

import com.javaproj.studentmanagementsys.sms.entity.Student;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
