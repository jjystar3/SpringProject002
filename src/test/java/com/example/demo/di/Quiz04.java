package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz04 {

	@Autowired
	Cafe cafe;
	
	@Autowired
	Manager manager;
	
	@Test
	void 테스트() {
		System.out.println(cafe.manager);
		System.out.println(manager);
	}
	
}
