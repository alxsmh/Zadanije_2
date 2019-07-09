/*
 * Task1
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package z2.task1.controller;
import static z2.validators.TypeValidator.isInt;
import static z2.validators.IntValidator.isNatural;
import static z2.covnerters.ConvertInt.fromString;
import static z2.outputs.OutputHelper.print;
import static z2.task1.coin.CoinFlipper.buildStringCoinFlipResultByThrowCount;

import static z2.inputs.InputHelper.inputString;


public class Task1 {

	public static void main(String[] args) {
		
		//future users throws count
		int thrower = 0;
		
		//MSGS
		String helloText = "\nHello! This is heads or tails game! Input how many times we will flip the coin:";
		String yourInputFormatText = "\nWe'll have %s flips. Ok go";
		
		//POINT OF ENTRY
		print(helloText);
		
		//input block
		//console input through Scanner(System.in)
		String input = inputString();
		
		//feedback user input
		print(yourInputFormatText,input);
		
		//validation, inputed value must be int type
		//if true: heads or tails game plays
		//else: error->exit
		if(isInt(input))
		{
			//getting number from user input
			thrower = fromString(input);
			
			if(isNatural(thrower))
			{
				print(buildStringCoinFlipResultByThrowCount(thrower));
			}
			else
			{
				print("\nERROR: we can't have negative throw count");
			}
		
		}
		else
		{
			print("\nERROR: inputed data is not a Integer number");
		}

	}

}
