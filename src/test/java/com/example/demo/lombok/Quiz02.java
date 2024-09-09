package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz02 {

	@Test
	void 롬복테스트() {
		
		Car car1 = Car
				.builder()
				.modelName("쏘나타")
				.brand("현대")
				.color("회색")
				.build();
		System.out.println(car1);
		
		Car car2 = new Car("X5","BMW","검은색");
		System.out.println(car2);
		
		Car car3 = new Car();
		car3.setModelName("스포티지");
		car3.setBrand("기아");
		car3.setColor("흰색");
		System.out.println(car3);
		
	}
	
}
