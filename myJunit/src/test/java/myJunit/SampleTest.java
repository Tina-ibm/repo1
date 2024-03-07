package myJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void test() {
		Sample c=new Sample();
		assertEquals("Welcome",c.m1());
	}

}
