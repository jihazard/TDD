package LADDER;

import static org.junit.Assert.*;

import org.junit.Test;

import core.NaturalNum;
import core.NaturalNumberTest;
import core.Postion;
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
	
	@Test
	public void testDrawLineWhenOver() throws Exception {
		try {
			Ladder ladder = new Ladder(new NaturalNum(3), new NaturalNum(4));
			ladder.drawLine(new NaturalNum(4), new NaturalNum(4));
			fail("illegalArgumentException 에러가 발생합니다.");
			
		} catch (IllegalArgumentException e) {
			assertTrue(true);
			// TODO: handle exception
		}
	}
	
	
	@Test
	public void testGenerator() throws Exception {
		Row[] rows = new Row[3];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = new Row(new NaturalNum(3));	
		}
		String result = LadderRunner.generator(rows , new Postion( new NaturalNum(1), new NaturalNum(1)));
		assertEquals("0* 0 0 \n0 0 0 \n0 0 0 \n", result);
	}
	
	@Test
	public void testGenerator_라인이있는경우() throws Exception {
		Row[] rows = new Row[3];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = new Row(new NaturalNum(3));	
		}
		rows[0].drawLine(new NaturalNum(1));
		String result = LadderRunner.generator(rows , new Postion( new NaturalNum(1), new NaturalNum(1)));
		assertEquals("1* -1 0 \n0 0 0 \n0 0 0 \n", result);
	}


}
