package com.example.StudentSystem.com.example.StudentSystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.StudentSystem.com.example.StudentSystem.repo.StudentRepo;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Repotest {
	
	@Autowired
	private StudentRepo studentRepo;
	
//	@Test
//	public void isStudentExist() {
//		Student student = new Student(2,"Suman","Bangalore");
//		
//		Student newstudent = studentRepo.save(student);
//		
//		 assertThat(newstudent)).isTrue();
//	}

}
