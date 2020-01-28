package br.com.cicero.reversestring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ReverseStringTest {
	
	@DisplayName("Reverse String test with StringBuilder")
	@Test
	public void testReverseStrWithStringBuilder() {
		
		ReverseString reverseString = new ReverseString();
		assertEquals("gnirtS detseT", reverseString.reverseStringStringBuilder("Tested String"));
	}
	
	
	@DisplayName("Reverse String test with StringBuilder with Error")
	@Test
	public void testReverseStrWithStringBuilderError() {
		
		ReverseString reverseString = new ReverseString();
		assertEquals("Error", reverseString.reverseStringStringBuilder("r"));
		assertEquals("Error", reverseString.reverseStringLooping(""));
		assertEquals("Error", reverseString.reverseStringLooping("   "));
		assertEquals("Error", reverseString.reverseStringLooping(null));
	}
	
	@DisplayName("Reverse String test with Looping")
	@Test
	public void testReverseStrWithLooping() {
		
		ReverseString reverseString = new ReverseString();
		assertEquals("gnirtS detseT", reverseString.reverseStringLooping("Tested String"));
	}
	
	@DisplayName("Reverse String test with Looping with Error")
	@Test
	public void testReverseStrWithLoopingError() {
		
		ReverseString reverseString = new ReverseString();
		assertEquals("Error", reverseString.reverseStringLooping("T"));
		assertEquals("Error", reverseString.reverseStringLooping("   "));
		assertEquals("Error", reverseString.reverseStringLooping(""));
		assertEquals("Error", reverseString.reverseStringLooping(null));
	}
	
}
