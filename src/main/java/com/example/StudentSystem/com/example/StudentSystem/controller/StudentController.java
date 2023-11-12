package com.example.StudentSystem.com.example.StudentSystem.controller;


import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.StudentSystem.com.example.StudentSystem.model.Student;
import com.example.StudentSystem.com.example.StudentSystem.service.StudentService;

@RestController

@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;// injecting the student service

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/add")
	public String add(@RequestBody Student studnt) {
		service.save(studnt);
		return "New Student is Added";

	}

	@GetMapping("/getAll")
	public List<Student> getAllStudent() {
		return service.getAllStudents();
	}

	@GetMapping("/users")
	public String getProductList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8085/api/users/", HttpMethod.GET, entity, String.class)
				.getBody();
	}
}
