package com.example.StudentSystem.com.example.StudentSystem;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.StudentSystem.com.example.StudentSystem.repo.StudentRepo;
import com.example.StudentSystem.com.example.StudentSystem.service.StudentService;
import com.example.StudentSystem.com.example.StudentSystem.service.StudentServiceImpl;


@ExtendWith(MockitoExtension.class)
public class TestService {
	
	@Mock
	private StudentRepo repo;
	
	private StudentService service;
	
	@BeforeEach
	void setUp() {
		this.service = new StudentServiceImpl(repo);
	}
	
	
	
	@Test
	void getAllStudents() {
		
		service.getAllStudents();
		verify(repo).findAll();
		
	}

}
