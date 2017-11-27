package LADDER;

import junit.framework.TestCase;

public class rowTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testMoveWhenLineLeft() throws Exception {
		// 1 1 0
		Ladder ladder = new Ladder(1,3);
		ladder.drawLine(0, 1);
		int target = ladder.run(2);
		assertEquals(1, target);

		// 0 1 1
		ladder = new Ladder(1,3);
		ladder.drawLine(0,0);
		
		target = ladder.run(0);

	}
}
