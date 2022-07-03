package com.example.StudentSystem.com.example.StudentSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>//<Nameof model class, DataType of primary key>  
{
	
	
}
