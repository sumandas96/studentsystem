package com.example.StudentSystem.com.example.StudentSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.StudentSystem.com.example.StudentSystem.model.Student;

@Service
public interface StudentService {
	
	public Student save(Student student) ;
	
	public List<Student> getAllStudents();
	

}
