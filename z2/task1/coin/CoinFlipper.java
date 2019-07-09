/*
 * CoinFlipper
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package z2.task1.coin;

import java.util.Random;

//heads or tails game class
public class CoinFlipper {
	
	//codes of result
	final static int tail = 0;
	final static int head = 1;
	final static int edge = 2;
	
	 //Sensitivity of game mechanism: larger -> more sensitive
	//does not recommended to make this value lower than 100
	//game interest will be lost
	static int sensitivity  = 250;
	
	//calculating code of edge result
	static int edgeValue = sensitivity / 2;
	
	//Static String MSGs
	static String headsText = "\nHeads:";
	static String tailsText = "\nTails:";
	static String edgeText = "\nEdges:";
	
	//-- return result of coin flip
	//we have to pass Random class object
	public static int calculateCoinFlipResult(Random a)
	{
		//see variables
		int throwResult = a.nextInt(sensitivity); 
		
		//if result of flip is edge, return( code 2 ):
		if(throwResult == edgeValue)
		{
			return edge;
		}
		else 
		{
			//if result of flip larger than edge: it is head( code 1 )
			//esle: tail ( code 0 )
			return (throwResult > edgeValue) ? head:tail;
		}
		
	}
	
	//-- builds result Sring of throwCount flips
	public static String buildStringCoinFlipResultByThrowCount(int throwCount)
	{
		//for randomizind of results
		Random randomResult = new Random();
		
		int iterations = throwCount;
		
		int tails = 0;
		int edges = 0;
		int heads = 0;
		
		while (iterations > 0)
		{
			//Random class variable is passed
			//calculate result of flip
			switch (calculateCoinFlipResult(randomResult))
			{
				//code 1
				case head: 
					heads++;
					break;
				
				//code 0
				case tail: 
					tails++;
					break;
					
				//code 2
				case edge: 
					edges++;
					break;
					
				default: break;
			}
			
			iterations--;
		}
		
		//build String
		//see variables for text
		return headsText + heads + tailsText + tails + edgeText + edges;
	}

}
