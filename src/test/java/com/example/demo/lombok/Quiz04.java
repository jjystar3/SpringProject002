package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz04 {

	@Test
	void 롬복테스트() {
		
		Movie movie1 = new Movie();
		movie1.setTitle("토이스토리");
		movie1.setDirector("존 라세터");
		movie1.setDate("1995-11-22");
		System.out.println(movie1);
		
		Movie movie2 = new Movie("양들의침묵", "조나단 드미", "1991-2-14");
		System.out.println(movie2);
		
		Movie movie3 = Movie
				.builder()
				.title("가위손")
				.director("팀 버튼")
				.date("1990-12-7")
				.build();
		System.out.println(movie3);
		
	}
	
}
