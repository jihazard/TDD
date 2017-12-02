package RowTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import LADDER.NaturalNum;
import LADDER.NaturalNumber;
import LADDER.Row;

public class RowTest {
	private Row row;
	
	
	
	@Before
	public void setUp() throws Exception {
		row = new Row(new NaturalNum(3));
	
	}
	
	
	@Test
	public void testStartPostionWhenOverNoOfPersons() throws Exception {
		try {
			
			row.drawLine(new NaturalNum(1));
			row.drawLine(new NaturalNum(2));
			fail("IllegalArgumentException 일리갈아규먼트 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			assertTrue(true);
		}
		
	}
	

	public void testWhenNoLine() throws Exception {
		
		int target = row.move(new NaturalNum(1));
		assertEquals(0, target);

		target = row.move(new NaturalNum(3));
		assertEquals(2, target);

	}

	
	public void testWhenLineLeft() throws Exception {
		// 1 1 0
		
		row.drawLine(new NaturalNum(2));
		int target = row.move(new NaturalNum(3));
		assertEquals(3, target);

		

	}
	
	
	public void testWhenLineRight() throws Exception {
		// 0 1 1
		
		row.drawLine(new NaturalNum(1));

		int target = row.move(new NaturalNum(2));

		assertEquals(3, target);

 

	}
}
