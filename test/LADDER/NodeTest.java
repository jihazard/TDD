package LADDER;

import static org.junit.Assert.*;

import org.junit.Test;

import static LADDER.Node.Direction.*;

public class NodeTest {

@Test
public void testCenter() throws Exception {
	Node node = Node.createCenterNode();
	
	assertEquals(Node.createCenterNode(), Node.createCenterNode());
	
}

	@Test
	public void testChangeRight() throws Exception {
		Node node = Node.createCenterNode();
		node.changeRight();
		assertEquals(Node.createRIGHTNode(), node);
	}
	@Test
	public void testChangeLEFT() throws Exception {
		Node node = Node.createCenterNode();
		node.changeLeft();
		assertEquals(Node.createLEFTNode(), node);
	}
	
	@Test
	public void testMoveRight() throws Exception {
		Node node = Node.createRIGHTNode();
		Marker marker = node.move(new Marker(3));
		assertEquals(new Marker(4), marker);
	}
	
	@Test
	public void testMoveLeft() throws Exception {
		Node node = Node.createLEFTNode();
		Marker marker = node.move(new Marker(3));
		assertEquals(new Marker(2), marker);
	}
	
	
	@Test
	public void testMoveCenter() throws Exception {
		Node node = Node.createCenterNode();
		Marker marker = node.move(new Marker(3));
		assertEquals(new Marker(3), marker);
	}
}
