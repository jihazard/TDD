package RowTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import LADDER.Marker;
import LADDER.Row;
import core.NaturalNum;

public class RowTest {
	private Row row;
	
	
	
	@Before
	public void setUp() throws Exception {
		row = new Row(new Marker(3));
	
	}
	
	
	@Test
	public void testStartPostionWhenOverNoOfPersons() throws Exception {
		try {
			
			row.drawLine(new Marker(1));
			row.drawLine(new Marker(2));
			fail("IllegalArgumentException 일리갈아규먼트 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			assertTrue(true);
		}
		
	}
	

	public void testWhenNoLine() throws Exception {
		
		NaturalNum target = row.move(new Marker(1));
		assertEquals(1, target.getNumber());

		target = row.move(new Marker(3));
		assertEquals(2, target.getNumber());

	}

	
	public void testWhenLineLeft() throws Exception {
		// 1 1 0
		
		row.drawLine(new Marker(2));
		NaturalNum target = row.move(new Marker(3));
		assertEquals(2, target.getNumber());

		

	}
	
	
	public void testWhenLineRight() throws Exception {
		// 0 1 1
		
		row.drawLine(new Marker(1));

			NaturalNum target = row.move(new Marker(2));
			assertEquals(3, target.getNumber());

 

	}
}
