 package LADDER;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NatrualNumberTest {

	@Before
	public void setUp() throws Exception {
	}


	
	@Test
	public void testCreate() throws Exception {
		NaturalNumber number = new NaturalNumber(1);
		assertEquals(1, number.getNumber());
	}
	
	@Test
	public void testCreateWhenUnderZero() throws Exception {
		try {
			
			new NaturalNumber(0);
		
			fail("IllegalArgumentException 일리갈아규먼트 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			
			assertTrue(true);
		}
	}

	
	@Test
	public void testToArrayIndex() throws Exception {
		NaturalNumber number = new NaturalNumber(3);
		assertEquals(2, number.toArrayIndex());
	}
}
