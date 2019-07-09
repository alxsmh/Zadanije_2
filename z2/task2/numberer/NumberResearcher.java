/*
 * NumberResearcher
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package z2.task2.numberer;

public class NumberResearcher {
	
	//-- find out max digit of int number
	public static int computeMaxDigit(int input)
	{
		//pick last digit of number as max
        int max = input % 10;
 
        //every iteration, input would be divided by 10
        //lasts compared to max
        //if max lower than rest of division by 10
        //max = rest 
        while (input > 0) 
        {
            if (input % 10 > max) 
            {
            	max = (int) (input % 10);
            }
            
            input/=10;
        }
        
        return max;
	}
	
	//-- return reversed number
	public static int reverseNumber(int input)
	{
        int reversed = 0;
 
        //while input divides by 10
        //we put rests of division in reversed
        //every put reversed multiplies by 10
        while (input > 0) 
        {
            reversed = reversed*10 + input % 10;
            
            input/=10;
        }
        
        return reversed;
	}
	
	//-- if number equals its reversed version, its a palindrom number
	public static boolean isPalindrom(int input)
	{
		return (input == reverseNumber(input)) ? true:false;
	}
	
	//-- gives the answer, is inputed number - simple
	public static boolean isSimple(int input)
	{
		//simple can be divided by 1 and itself
		int dividers = 2;
		
		//default simple numbers check
		if (input < 1)
		{
			return false;
		}
		else if (input < 4)
		{
			return true;
		}
		
		//pick threshold as highest of possible dividers
		int divideTreshold = input/2;
		
		//finding out if there's more than two dividers
		//if two: number is simple
		//if larger than two: number is not simple; exit
		for (int i = 2; i<= divideTreshold; i++)
		{
			if (nextSimpleDivider(input, i) != 0)
			{
				dividers++;
			}
			if (dividers > 2)
			{
				return false;
			}
		}
		//repeated dividers check, just in case
		//if two: number is simple
		//if larger than two: number is not simple; exit
		return !(dividers > 2) ? true:false;
	}
	
	//-- return next simple divider, depending on previous one
	//!! TODO: get rid of macaroni cycle (isSimple uses nextSimpleDivider and vice versa)
	public static int nextSimpleDivider (int input, int prevDivider)
	{
		//pick threshold as highest of possible dividers
		int divideTreshold = input / 2;
		
		//picks incremented previous divider, and checks its simplicity
		//by dividing input on i
		//and isSimple call
		for (int i = ++prevDivider; i <= divideTreshold; i++)
		{
			if ((isSimple(i))&&(input % i == 0))
			{
				return i;
			}
		}
		
		return 0;
	}
	
	//-- gives a string with simple dividers of inputed int
	public static String buildStringOfSimpleDividers(int input)
	{
		String result = "1";
		
		int divideTreshold = input/2;
		int tmp = 0;
		
		for (int i = 0; i<= divideTreshold; i++)
		{
			if ((isSimple(i))&&(input % i == 0))
			{
				//while tmp !=0; result += tmp
				tmp = nextSimpleDivider(input, i);
				
				if(tmp != 0)
				{
					result += ", " + tmp;
				}
			}
			
		}
		
		// if input is a simple number
		//true: add it to result
		if(isSimple(input))
		{
			result += ", " + input;
		}
		
		
		return result;
	}

	//-- NOD
	public static long NOD(int a, int b)
	{
		return (b == 0) ? a:NOD(b, a % b);
	}
	 
	//-- NOK
	public static long NOK(int a, int b)
	{
		return a * b / NOD(a,b);
	}
	
	//-- returns count of different digits in number
	public static int calculateDifferentDigitsCount(int input)
	{
		int count = 0;
		int tmp = 0;
		
		//uses string as digits warehouse
		String buffer = "";
		
		//get lenght of input number
		int size = calculateLenghtOfNumber(input);
		
		for (int i = 0; i<size; i++)
		{
			//rest from input division by 10
			tmp = input % 10;
			//division of input
			input /= 10;
			
			//if buffer has same digit as tmp: skip
			//else: add tmp to buffer and increment count (it is different digit from discovered ones)
			//!! regular expression !!
			if(buffer.matches("(.*)"+String.valueOf(tmp)+"(.*)"))
			{
				
			}
			else
			{
				buffer += String.valueOf(tmp);
				count++;
			}
		}
		
		return count;
	}
	
	//-- calculate length of number while there are lasts of division on 10
	private static int calculateLenghtOfNumber(int value)
	{
		int len = 0;
		int tmp = value;
		
		//default check: zero value has length 1
		if(tmp == 0)
		{
			len++;
		}
		else
		{
			//if tmp divides by 10
			//length ++
			//tmp /= 10;
			while (tmp>0)
			{
				tmp /= 10;
				len++;
			}
		}
		
		return len;
	}
	
	//-- return summ of simple dividers of number
	public static int sumOfSimpleDividers(int input)
	{
		int sum = 0;
		
		for (int i = 1; i <= input / 2; i++)
		{
			if ((input %i == 0)&&(isSimple(i)))
			{
				sum += i;
			}
		}
		
		return sum;
	}
	
}
