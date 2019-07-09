/*
 * Task2
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package z2.task2.controller;
import static z2.covnerters.ConvertInt.fromString;
import static z2.validators.TypeValidator.isInt;
import static z2.validators.IntValidator.isNatural;
import static z2.outputs.OutputHelper.print;
import static z2.outputs.OutputHelper.outputConsoleBooleanResultText;
import static z2.inputs.InputHelper.inputString;

import static z2.task2.numberer.NumberResearcher.computeMaxDigit;
import static z2.task2.numberer.NumberResearcher.isPalindrom;
import static z2.task2.numberer.NumberResearcher.isSimple;
import static z2.task2.numberer.NumberResearcher.buildStringOfSimpleDividers;
import static z2.task2.numberer.NumberResearcher.NOD;
import static z2.task2.numberer.NumberResearcher.NOK;
import static z2.task2.numberer.NumberResearcher.calculateDifferentDigitsCount;

public class Task2 {

	public static void main(String[] args) {

		//MSG block
		String task2Text = "\nTask2. Number researching. Input your number:";
		String yourInputFormatText = "\n %s";
		
		String maxDigText = "\nMaximum digit : %d";
		String palindromText = "\nIs that palindromic number 	: ";
		String simpleNumText = "\nIs that simple number 		: ";
		String simpleDivText = "\nSimple dividers of number 	: %s";
		String digitCountText = "\nDifferent digit count	 	: %d";
		String yes = "Yes";
		String no = "No";
		
		//HELLO MSG output
		print(task2Text);
		
		//inputs
		//console input from z2.inputs
		String input = inputString();
		
		//feedback user input
		print(yourInputFormatText,input);
		
		//if user enters integer number that upper than zero
		//true: goes to subtasks
		//false: input error
		if((isInt(input))&&(isNatural(fromString(input))))
		{
			//subtask one
			//find max digit in number
			print(maxDigText,computeMaxDigit(fromString(input)));
			
			//subtask two
			//is number a palindrom?
			print(palindromText);
			outputConsoleBooleanResultText(yes,no,isPalindrom(fromString(input)));
			
			//subtask three
			//is simple number?
			print(simpleNumText);
			outputConsoleBooleanResultText(yes,no,isSimple(fromString(input)));
			
			//subtask four
			//all simple dividers of number
			print(simpleDivText,buildStringOfSimpleDividers(fromString(input)));
			
			//subtask  five
			//NOD/NOK
			print("\nNOD of 172,25 : %d",(int)NOD(172,25));
			print("\nNOK of 172,25 : %d",(int)NOK(172,25));
			
			//subtask six 
			//different digits count
			print(digitCountText,calculateDifferentDigitsCount(fromString(input)));
		}
		
	}

}
