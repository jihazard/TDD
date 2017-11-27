package RowTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import LADDER.Row;

public class RowTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testNoOfPersons() throws Exception {
		try {

			 new Row(0);
			fail("IllegalArgumentException 에러가 발생햏야 합니다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
			
		}
		
	}
	
	
	@Test
	public void testStartPostionWhenMinus() throws Exception {
		try {
			Row row = new Row(3);
			row.drawLine(-1);
			fail("IllegalArgumentException 일리갈아규먼트 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	
	@Test
	public void testDrawLineWhenAlreadyDrawingPostion() throws Exception {
		try {
			Row row = new Row(3);
			row.drawLine(0);
			row.drawLine(1);
			fail("IllegalArgumentException 일리갈아규먼트 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	@Test
	public void testStartPostionWhenOverNoOfPersons() throws Exception {
		try {
			Row row = new Row(3);
			row.drawLine(2);
			fail("IllegalArgumentException 일리갈아규먼트 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			assertTrue(true);
		}
		
	}
	

	public void testWhenNoLine() throws Exception {
		Row row = new Row(3);
		int target = row.move(0);
		assertEquals(0, target);

		target = row.move(2);
		assertEquals(2, target);

	}

	
	public void testWhenLineLeft() throws Exception {
		// 1 1 0
		Row row = new Row(3);
		row.drawLine(1);
		int target = row.move(2);
		assertEquals(1, target);

		

	}
	
	
	public void testWhenLineRight() throws Exception {
		// 0 1 1
		Row row = new Row(3);
		row.drawLine(1);

		int target = row.move(1);

		assertEquals(2, target);

 

	}
}
