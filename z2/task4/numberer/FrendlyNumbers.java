/*
 * FrendlyNumbers
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package z2.task4.numberer;
import static z2.task3.numberer.PerfectNumber.sumOfDividers;

public class FrendlyNumbers {
	
	//-- return String with friendly number pairs from [left,right]
	public static String findFrendlyNumbersIn (int leftLimit, int rightLimit)
	{
		String result = "";
		
		for (int i = leftLimit; i<= rightLimit; i++)
		{
			//we have to know sum of dividers of i (-> div)
			//to compare it with initial i
			//because if sumOfDividers(i) = sumOfDividers(div)
			//we got the pair
			//function from z2.task3.numberer.PerfectNumber
			
			//:example
			//:i = 220
			int div = sumOfDividers(i);		//: <- 284
			
			//compare i with sumOfDividers(i)
			//: isFriendly(220,284)
			if (( isFriendly(i,div)) && (div != i))
			{
				result += i + ":" + div + ", ";
			}
		}
		return result;
	}
	
	//-- comparsion of number its sumOfDividers
	public static boolean isFriendly (int a, int b)  
	{
		//: a=220, b=284
		int divB = sumOfDividers(b); 	//: <- 220
		
		//if sumOfDividers(b) == a, numbers are friendly
		//: 220 == a(220)
		//: return true
		if (( divB == a) && (divB != b))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	
}
