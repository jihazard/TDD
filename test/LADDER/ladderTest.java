package LADDER;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ladderTest extends TestCase {

	private Ladder ladder;

	protected void setUp() throws Exception {
		super.setUp();
	}

	/*// 1by1
	public void testWhenNoLine() throws Exception {
		Ladder ladder = new Ladder(3);
		int target = ladder.run(0);
		assertEquals(0, target);

		target = ladder.run(2);
		assertEquals(2, target);

	}
*/
	public void testWhenLineLeft() throws Exception {
		ladder = new Ladder(new NaturalNum(1),new NaturalNum(3));
		ladder.drawLine(new NaturalNum(1),new NaturalNum(3));
		int target = ladder.run(2);
		assertEquals(1, target);

		// 0 1 1
	    ladder = new Ladder(new NaturalNum(1),new NaturalNum(3));
		ladder.drawLine(new NaturalNum(1),new NaturalNum(1));
		
		target = ladder.run(0);

	}

	public void testWhenLineRight() throws Exception {
		// 0 1 1
		new Ladder(new NaturalNum(1),new NaturalNum(3));
		ladder.drawLine(new NaturalNum(1),new NaturalNum(3));

		int target = ladder.run(1);
		assertEquals(2, target);

		// 0 1 1
		ladder = new Ladder(new NaturalNum(1),new NaturalNum(3));
		ladder.drawLine(new NaturalNum(1),new NaturalNum(2));
		target = ladder.run(2);
		assertEquals(1, target);
	}
	
	@Test
	public void testRunWhenMultiRows() throws Exception {
		//1 1 0 0 
		//0 1 1 0
		//0 0 1 1
 		Ladder ladder =  new Ladder(new NaturalNum(3),new NaturalNum(4));
 		ladder.drawLine(new NaturalNum(1),new NaturalNum(1));
		ladder.drawLine(new NaturalNum(2),new NaturalNum(2));
		ladder.drawLine(new NaturalNum(3),new NaturalNum(3));
		
		
		assertEquals(3, ladder.run(0));
		assertEquals(0, ladder.run(1));
		assertEquals(1, ladder.run(2));
		assertEquals(2, ladder.run(3));
	}

}
