package com.javaproj.studentmanagementsys;

import com.javaproj.studentmanagementsys.sms.entity.Student;
import com.javaproj.studentmanagementsys.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSysApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSysApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    //executes when we run spring boot
    @Override
    public void run(String... args) throws Exception {
        /*
        Student student1 = new Student("John", "Doe", "johndoe@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("David", "Bowie", "davidbowie@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Tony", "Stark", "tonystark@gmail.com");
        studentRepository.save(student3);

        */
    }
}
