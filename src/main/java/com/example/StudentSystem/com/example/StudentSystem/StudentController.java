package com.example.StudentSystem.com.example.StudentSystem;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;//injecting the student service
	
	
	@PostMapping("/add")
	public String add(@RequestBody Student studnt) {
		service.save(studnt);
		return "New Student is Added";
		
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		return service.getAllStudents();
	}
	
	
	
	
	

	

}
