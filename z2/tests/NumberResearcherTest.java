package z2.tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static z2.task2.numberer.NumberResearcher.computeMaxDigit;
import static z2.task2.numberer.NumberResearcher.reverseNumber;
import static z2.task2.numberer.NumberResearcher.isPalindrom;
import static z2.task2.numberer.NumberResearcher.isSimple;
import static z2.task2.numberer.NumberResearcher.buildStringOfSimpleDividers;
import static z2.task2.numberer.NumberResearcher.nextSimpleDivider;

public class NumberResearcherTest {

	@Test
	public void computeMaxDigit_Int19823_Expected9()
	{
		int expected = 9;
		int actual = computeMaxDigit(19823);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void computeMaxDigit_Int0_Expected0()
	{
		int expected = 0;
		int actual = computeMaxDigit(0);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void reverseNumber_Int128821_Expected128821()
	{
		int expected = 128821;
		int actual = reverseNumber(128821);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void reverseNumber_Int3458_Expected8543()
	{
		int expected = 8543;
		int actual = reverseNumber(3458);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPalindrom_Int3458_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isPalindrom(3458);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPalindrom_Int128821_ExpectedTRUE()
	{
		boolean expected = true;
		boolean actual = isPalindrom(128821);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isSimple_Int256_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isSimple(256);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isSimple_Int169_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isSimple(169);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isSimple_Int167_ExpectedTRUE()
	{
		boolean expected = true;
		boolean actual = isSimple(167);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isSimple_Int_minus3_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isSimple(-3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void buildStringOfSimpleDividers_Int_225_ExpectedSTRING()
	{
		String expected = "1, 3, 5";
		String actual = buildStringOfSimpleDividers(225);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void nextSimpleDivider_Int_6_2_Expected3()
	{
		int expected = 3;
		int actual = nextSimpleDivider(6,2);
		
		assertEquals(expected, actual);
	}
	
}
