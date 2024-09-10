package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz01 {

	@Autowired
	Dog dog;
	
	@Test
	void 테스트() {
		dog.sound();
	}

}
