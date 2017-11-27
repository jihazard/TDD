package RowTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import LADDER.Ladder;
import LADDER.Row;

public class RowTest {

	@Before
	public void setUp() throws Exception {
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
		Ladder ladder = new Ladder(1,3);
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
