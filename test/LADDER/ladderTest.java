package LADDER;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ladderTest extends TestCase {

	private Ladder ladder;

	@Test
	public void testRunWhenMultiRows() throws Exception {
		//1 1 0 0 
		//0 1 1 0
		//0 0 1 1
 		Ladder ladder =  new Ladder(new NaturalNum(3),new NaturalNum(4));
 		ladder.drawLine(new NaturalNum(1),new NaturalNum(1));
		ladder.drawLine(new NaturalNum(2),new NaturalNum(2));
		ladder.drawLine(new NaturalNum(3),new NaturalNum(3));
		
		
		assertEquals(4, ladder.run(new NaturalNum(1)));
		assertEquals(1, ladder.run(new NaturalNum(2)));
		assertEquals(2, ladder.run(new NaturalNum(3)));
		assertEquals(3, ladder.run(new NaturalNum(4)));
	}
	
	

}
