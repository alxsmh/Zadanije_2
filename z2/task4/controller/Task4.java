/*
 * Task4
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package z2.task4.controller;
import static z2.task4.numberer.FrendlyNumbers.findFrendlyNumbersIn;
import static z2.outputs.OutputHelper.print;

import static z2.inputs.InputHelper.inputString;
import static z2.covnerters.ConvertInt.fromString;


public class Task4 {

	public static void main(String[] args) {
		
		//print hello MSG
		print("Enter limits of area, where frendly numbers will be searched [left,right]\n");
		
		//input block
		//fromString in z2.inputs.InputHelper class
		int left = fromString(inputString());
		int right = fromString(inputString());
		
		//calls findFrendlyNumbersIn, prints the result
		//z2.task4.numberer.FrendlyNumbers
		print("Pairs of frendly numbers: %s",findFrendlyNumbersIn(left, right));
		

	}

}
