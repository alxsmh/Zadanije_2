package z2.tests;
import static org.junit.Assert.assertTrue;
import static z2.task1.coin.CoinFlipper.buildStringCoinFlipResultByThrowCount;
import static z2.task1.coin.CoinFlipper.calculateCoinFlipResult;

import java.util.Random;

import org.junit.Test;

public class CoinFlipperTest {
	
	@Test
	public void calculateCoinFlipResult_Random_expectedINT_0to2()
	{
		Random a = new Random();
		
		int actual = calculateCoinFlipResult(a);
		
		assertTrue((actual > 0) && (actual < 3));
	}
	
	@Test
	public void buildStringCoinFlipResultByThrowCount_INT2302_Throws_expectedResultWithSum2302()
	{
		int throwsCount = 2302;
		
		System.out.println(buildStringCoinFlipResultByThrowCount(throwsCount)); 
		
		//assertTrue((actual > 0) && (actual < 3));
	}

}
