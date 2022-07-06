package com.example.StudentSystem.com.example.StudentSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;//Inject Student Repository in service class

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	

	public StudentServiceImpl(StudentRepo repo) {
		// TODO Auto-generated constructor stub
		super();
		this.studentRepo = studentRepo;
	}
	
	

}
