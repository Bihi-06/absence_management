package com.fstt.gestion_d_absence.services;

import com.fstt.gestion_d_absence.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
