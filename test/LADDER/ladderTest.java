package LADDER;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ladderTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	// 1by1
	public void testWhenNoLine() throws Exception {
		Ladder ladder = new Ladder(3);
		int target = ladder.run(0);
		assertEquals(0, target);

		target = ladder.run(2);
		assertEquals(2, target);

	}

	public void testWhenLineLeft() throws Exception {
		// 1 1 0
		Ladder ladder = new Ladder(3);
		ladder.drawLine(1);
		int target = ladder.run(2);
		assertEquals(1, target);

		// 0 1 1
		ladder = new Ladder(3);
		ladder.drawLine(0);
		target = ladder.run(0);

	}

	public void testWhenLineRight() throws Exception {
		// 0 1 1
		Ladder ladder = new Ladder(3);
		ladder.drawLine(1);

		int target = ladder.run(1);
		assertEquals(2, target);

		// 0 1 1
		ladder = new Ladder(3);
		ladder.drawLine(1);
		target = ladder.run(2);
		assertEquals(1, target);
	}

}
