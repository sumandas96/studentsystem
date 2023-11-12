package com.example.StudentSystem.com.example.StudentSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentSystem.com.example.StudentSystem.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>//<Nameof model class, DataType of primary key>  
{
	
	
}
