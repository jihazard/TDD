package core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PostionTest {
	@Test
	public void testCreate() throws Exception {
			Postion postion1 = new Postion(new NaturalNum(3) , new NaturalNum(4));
	        Postion postion2 = new Postion(3,4);
	        
	        assertEquals(postion1,postion2);
	}

	
	@Test
	public void testCreateFromArrayIndex() throws Exception {
		Postion arrayPostion = Postion.createFromArrayIndex(2,3);
		Postion postion = new Postion(3,4);
		
		assertEquals(arrayPostion, postion);
		
	}
}
