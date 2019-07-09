/*
 * Task3
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package z2.task3.controller;

import static z2.inputs.InputHelper.inputString;
import static z2.outputs.OutputHelper.print;
import static z2.outputs.OutputHelper.outputConsoleBooleanResultText;
import static z2.covnerters.ConvertInt.fromString;
import static z2.validators.TypeValidator.isInt;
import static z2.validators.IntValidator.isNatural;

import static z2.task3.numberer.PerfectNumber.isPerfectNumber;

public class Task3 {

	public static void main(String[] args) {
		
		//print helloMsg to console
		print("Enter the number to find out if it's perfect one:");
		
		//request for console input
		String tmpInputStr = inputString();
		
		//if inputed string is int and it has value larger than zero
		//true: call isPerfectNumber
		//else: print ERROR
		if ((isInt(tmpInputStr))&&(isNatural(fromString(tmpInputStr))))
		{
			int number = fromString(tmpInputStr);
			
			outputConsoleBooleanResultText("Is perfect", "Not perfect", isPerfectNumber(number));
		}
		else
		{
			print("Error, not valid number or whatever");
		}
		
		

	}

}
