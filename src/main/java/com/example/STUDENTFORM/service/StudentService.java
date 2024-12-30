package com.example.STUDENTFORM.service;

import com.example.STUDENTFORM.model.Student;
import com.example.STUDENTFORM.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentre;

    public StudentService(StudentRepository studentre) {
        this.studentre = studentre;
    }
    public List<Student>getAllStudents()
    {
        return studentre.findAll();
    }
    public Student create (Student student)
    {
        return studentre.save(student);
    }
    public Optional<Student>getById(Long id)
    {
        return studentre.findById(id);
    }
    public void deleteById(Long id)
    {
        studentre.deleteById(id);
    }
    public List<Student> Read()
    {
        return studentre.findAll();
    }
}
