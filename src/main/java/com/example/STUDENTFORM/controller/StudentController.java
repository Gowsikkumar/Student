package com.example.STUDENTFORM.controller;

import com.example.STUDENTFORM.model.Student;
import com.example.STUDENTFORM.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentser;

    public StudentController(StudentService studentser) {
        this.studentser = studentser;
    }

    @GetMapping("/")
    public String studentform(Model model)
    {
        model.addAttribute("Student", new Student());
        return "student-form";
    }
    @PostMapping("/new")
    public String newform(@Valid @ModelAttribute("Student") Student student, BindingResult result, Model model)
    {
        if(result.hasErrors())
        {
            System.out.println("dfsghjberrroghbjnmk======================");
            return "student-form";
        }
        studentser.create(student);
        model.addAttribute("message","Student successfully registered!");
         model.addAttribute("students",studentser.getAllStudents());
         return "success";
    }


    @GetMapping("/del/{id}")
    public String delete(@PathVariable("id") Long id, Model mod)
    {
        studentser.deleteById(id);
        mod.addAttribute("students",studentser.Read());
        return "success";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model mod)
    {
        mod.addAttribute("students",studentser.getById(id).get());
        return "edit";
    }
    @PostMapping("/update/{id}")
    public  String  update(@PathVariable Long id,@ModelAttribute Student student,Model mod)
    {
        studentser.create(student);
        mod.addAttribute("students",studentser.Read());
        return "success";
    }
}
