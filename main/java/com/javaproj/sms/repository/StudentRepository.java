package com.javaproj.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaproj.sms.entity.Student;


//parameters: <jp entity, type of primary key>
public interface StudentRepository extends JpaRepository<Student, Long> {
}
