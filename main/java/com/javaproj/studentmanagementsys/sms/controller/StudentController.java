package com.javaproj.studentmanagementsys.sms.controller;

import com.javaproj.studentmanagementsys.sms.entity.Student;
import com.javaproj.studentmanagementsys.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//the purpose of this class is to handle requests

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //handler method to handle list student request
    //return mode and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        //create student obj to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    //directly bind form data to student object
    //bind into student entity
    public String saveStudent(@ModelAttribute("student") Student student) {
        //save student into db
        studentService.saveStudent(student);
        return "redirect:/students";
    }

}
