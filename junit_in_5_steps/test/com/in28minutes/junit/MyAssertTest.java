package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MyAssertTest {
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void test() {
	Boolean test = todos.contains("WS"); //Result
	Boolean test2 = todos.contains("GCP"); //Result

	//assertEquals(true, test);
	assertFalse(test2);
	//assertTrue("Something went wrong", test);
	assertEquals(3, todos.size(), "failure message");
	
	//assertNull, assertNotNull

	assertArrayEquals(new int[] {1, 2}, new int[] {2});
	assertArrayEquals(new int[] {1, 2}, new int[] {2, 1});
	//arrays first differed at element [0]; expected<1> but was <2>
	}
}
