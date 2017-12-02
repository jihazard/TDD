package LADDER;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {


	
	@Test
	public void testCreate() throws Exception {
		NaturalNum natual = new NaturalNum(1);
		assertEquals(1, natual.getNumber());
		
	}
	
	@Test
	public void testCreatetWhenUnderZero() throws Exception {
		try {
			new NaturalNum(0);
			fail("일리갈 에러가 발생해야 합니다.");
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			assertTrue(true);
		}
	}
	
	@Test
	public void testArrayIndex() throws Exception {
		NaturalNum number = new NaturalNum(3);
		assertEquals(2, number.toArrayIndex());
		
	}
}
