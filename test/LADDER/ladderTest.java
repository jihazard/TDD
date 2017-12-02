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
		
		assertEquals(new Marker(4), ladder.run(new Marker(1)));
		assertEquals(new Marker(1), ladder.run(new Marker(2)));
		assertEquals(new Marker(2), ladder.run(new Marker(3)));
		assertEquals(new Marker(3), ladder.run(new Marker(4)));
		
	}
	
	

}
