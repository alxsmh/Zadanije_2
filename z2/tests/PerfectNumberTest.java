package z2.tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static z2.task3.numberer.PerfectNumber.isPerfectNumber;

public class PerfectNumberTest {

	@Test
	public void isPerfectNumber_Int6_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isPerfectNumber(6);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectNumber_Int28_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isPerfectNumber(28);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectNumber_Int496_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isPerfectNumber(496);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectNumber_Int8128_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isPerfectNumber(8128);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectNumber_Int9_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = isPerfectNumber(9);
		
		assertEquals(expected, actual);
	}
	
}
