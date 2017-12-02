package LADDER;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MarkerTest {

	@Test
	public void testMoveRight() throws Exception {
		Marker marker = new Marker(3);
		//int result= marker.moveRight()
		assertEquals(new Marker(4), marker.moveRight());
	}
	
	@Test
	public void testMoveLeft() throws Exception {
		Marker marker = new Marker(3);
		//int result= marker.moveRight()
		assertEquals(new Marker(2), marker.moveLeft());
	}
}
