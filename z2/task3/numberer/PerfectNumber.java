/*
 * PerfectNumber
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package z2.task3.numberer;

public class PerfectNumber {

	//-- return true if number is perfect
	public static boolean isPerfectNumber (int input)
	{
		//grab sum of input dividers
		int sum = sumOfDividers(input);
		
		//if sum of input variable = sum of its all dividers (except value itself)
		//true: return true
		//else: return false
		if(sum == input)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//-- calculates sum of input dividers
	public static int sumOfDividers(int input)
	{
		int sum = 0;
		
		//if input divides by i, sum = sum + i
		// input/2 its a maximum of possible division thresholds
		for (int i = 1; i <= input / 2; i++)
		{
			if (input %i == 0)
			{
				sum += i;
			}
		}
		
		return sum;
	}
}
