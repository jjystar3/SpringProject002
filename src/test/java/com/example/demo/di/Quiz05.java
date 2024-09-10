package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz05 {
	
	@Autowired
	Doctor doctor;
	
	@Autowired
	Hospital hospital;
	
	@Test
	void test() {
		System.out.println(hospital.doctor);
		System.out.println(doctor);
	}
	
}
