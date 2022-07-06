package com.example.StudentSystem.com.example.StudentSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;



@Entity
@Table(name="student_system")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "first stored procedure",
	procedureName = "getStudentAddress",
	parameters = {@StoredProcedureParameter
			(mode = ParameterMode.IN,name="address",type=String.class)})})

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //For autoincrement//
	private int id;
	private String name;
	private String address;
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
