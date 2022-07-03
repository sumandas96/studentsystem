package com.example.StudentSystem.com.example.StudentSystem;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
	
	public Student save(Student student) ;
	
	public List<Student> getAllStudents();
	

}
