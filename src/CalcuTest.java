import junit.framework.TestCase;

public class CalcuTest extends TestCase {
	Calcu cal; 

	protected void setUp() throws Exception {
		super.setUp();
		cal = new Calcu();
	}

	public void testAddWhenEmpty() {
		assertEquals(0,cal.add(""));
	}
	public void testAddWhenOneNumber() {
		assertEquals(3,cal.add("3"));
	}
	
	public void testAddWhentwoNumber() {
		assertEquals(3,cal.add("1,2"));
	}
	public void testAddWhenThreeNumber() {
		assertEquals(6,cal.add("1,2,3"));
	}
	public void testAddWhenThreeNumberNewLine() {
		assertEquals(6,cal.add("1\n2\n3"));
	}
	public void testAddWhenThreeNumberLineAndComma() {
		assertEquals(6,cal.add("1,2\n3"));
	}

}
