package com.example.StudentSystem.com.example.StudentSystem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentSystemApplicationTests {
	
	private Calculator calculator = new Calculator(); 

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void testSum() {
		
		int expectedvalue = 189;
		int actualvalue = calculator.doSum(4, 5, 9);
		
		assertThat(actualvalue).isEqualTo(expectedvalue);
		
	}

}
