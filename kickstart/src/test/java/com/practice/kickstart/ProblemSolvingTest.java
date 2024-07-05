package com.practice.kickstart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.practice.kickstart.problemSolving.Problem1;

@SpringBootTest
class ProblemSolvingTest {	
	@Test
	void problem1Test() {
		assertEquals("",Problem1.processStringToCamelCase(""));
		assertEquals("123",Problem1.processStringToCamelCase("123"));
		assertEquals("aGoToCartButton",Problem1.processStringToCamelCase("aGoToCartButton"));
		assertEquals("goToCartButton",Problem1.processStringToCamelCase("GoToCartButton"));
		assertEquals("nextButton",Problem1.processStringToCamelCase("nextButton"));
		assertEquals("searchBox",Problem1.processStringToCamelCase("search box"));
		assertEquals("searchBoxButton",Problem1.processStringToCamelCase("search   box button"));		
	}
}
