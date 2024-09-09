package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz01 {

	@Test
	void 롬복테스트() {

		Book book1 = new Book();
		book1.setName("스프링 기초");
		book1.setPrice(12000);
		book1.setPublisher("한빛출판사");
		book1.setPageCount(250);		
		System.out.println(book1);
		
		Book book2 = new Book("자바 마스터하기", 25000, "믿음출판사", 300);
		System.out.println(book2);
		
		Book book3 = Book
				.builder()
				.name("CSS 완전정복")
				.price(20000)
				.publisher("나무출판사")
				.pageCount(120)
				.build();
		System.out.println(book3);
	}
	
}
