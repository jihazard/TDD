import org.junit.Assert;

import junit.framework.TestCase;

public class TddCal extends TestCase {

	
	private StringCalculator cal;
	protected void setUp() throws Exception {
		super.setUp();
		cal = new StringCalculator();
	
	}

	public void testSplit() throws Exception{
		String[] result = cal.split("1");
		Assert.assertArrayEquals(new String[] {"1"},result);
		result = cal.split("");
		Assert.assertArrayEquals(new String[] {""},result);
		result = cal.split(null);
		Assert.assertArrayEquals(new String[] {},result);

	}
	public void testSplitComma() throws Exception{
		String[] result = cal.split("1,2,3");
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
				
	}
	public void testSplitWhenNewLine() throws Exception{
		String[] result = cal.split("1\n2\n3");
		Assert.assertArrayEquals(new String[] {"1","2","3"},result); 
				
	}
	public void testSplitWhenNewLineAndComma() throws Exception{
		String[] result = cal.split("1,2\n3");
		Assert.assertArrayEquals(new String[] {"1","2","3"},result);
				
	}
	
	
	public void testToInt() throws Exception {
		int[] result = cal.toInt(new String[]{"1","2"});
		Assert.assertArrayEquals(new int[]{1,2}, result);
		
	    result = cal.toInt(new String[]{});
		Assert.assertArrayEquals(new int[]{}, result);

		result = cal.toInt(null);
		Assert.assertArrayEquals(new int[]{}, result);

	}
	
	
	
	
	
}
 