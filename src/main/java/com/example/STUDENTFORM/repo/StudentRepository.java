package com.example.STUDENTFORM.repo;

import com.example.STUDENTFORM.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
