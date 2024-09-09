package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz03 {

	@Test
	void 롬복테스트() {
		
		Student student1 = new Student();
		student1.setStudentId("1001");
		student1.setName("민수");
		student1.setAge(15);
		System.out.println(student1);
		
		Student student2 = new Student("1002", "철수", 14);
		System.out.println(student2);
		
		Student student3 = Student
				.builder()
				.studentId("1003")
				.name("영희")
				.age(16)
				.build();
		System.out.println(student3);
		
	}
	
}
