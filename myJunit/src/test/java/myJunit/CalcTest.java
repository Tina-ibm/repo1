package myJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
	
	Calc c;
	
	@BeforeAll
	static void initAll() {
		System.out.println("Test Starts");
		
	}
	@AfterAll
	static void destroyAll()
	{
		System.out.println("test Completed");
	}
	
	@BeforeEach
	void init() {
		c=new Calc();
	}
	@AfterEach
	void destroy() {
		System.out.println("Test Done");
	}
	
	@Test
	void calcAvg() {
		Calc c=new Calc();
		assertEquals(15,c.avg(10,20),"Logical Error");
	}
	@Test
	void calcAdd() {
		Calc c=new Calc();
		assertEquals(c.expectedAdd,c.add(10,20),"Add Logic Error");
	}

}
