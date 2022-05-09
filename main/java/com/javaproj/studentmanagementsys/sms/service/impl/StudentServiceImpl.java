package com.javaproj.studentmanagementsys.sms.service.impl;

import com.javaproj.studentmanagementsys.sms.entity.Student;
import com.javaproj.studentmanagementsys.sms.repository.StudentRepository;
import com.javaproj.studentmanagementsys.sms.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        //returns list of all students
        return studentRepository.findAll();
    }
}
