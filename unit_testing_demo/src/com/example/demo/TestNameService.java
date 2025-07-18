package com.example.demo;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestNameService {

	NameService service;
	@Test
	@Disabled(value = "This is added by IDE hence ignored")
	void test() {
		fail("Not yet implemented");
	}
	
	
	@BeforeEach
	void init(TestInfo info) {
		
		System.out.println(info.getTestMethod().get().getName() + "Called");
		 service = new NameService();

		
	}
	
	@Test
	@DisplayName("Test bestName must does not return null")
	void testbestName() {
		
		
		String actual = service.getBestName();
		
		
		
		assertNotNull(actual);
		
	}

	@Test
	@DisplayName("Test BestName Must return a Name whose length is 5 and it should not be null")
	void  testBestNameReturnValue() {
		

		assertAll("testing bestname",
				()->{
					assertEquals(5, service.getBestName().length());
				},
				() ->{
					
					assertNotNull(service.getBestName());
				}
				);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3})
	@DisplayName("Test Elements in Odd Postions are not Null")
	void testElementInOddPostion(int idxPos) {
		
		int  dayOfWeek =LocalDate.now().getDayOfWeek().getValue();

		assumeTrue(dayOfWeek==4, "Test will run thursday");
		
		
		  service.getNames().get(idxPos);
		  
		  
		
	}
	
	
	@Test
	@DisplayName("Test getResult throws RunTimeExceptio with message Invalid Mark")
	
	
	
	
	
	@AfterEach
	void destory(TestInfo info) {
		
		
		
		System.out.println(info.getTestMethod().get().getName() + "Destroyed");

		service=null;
	}
	
}
