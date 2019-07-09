/*
 * InputHelper
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */


package z2.inputs;

import java.util.Scanner;

public class InputHelper {
	
	//console String input
	//used java.util.Scanner
	public static String inputString()
	{
		Scanner input = new Scanner(System.in);
		
		String inputed =  input.nextLine();
		
		input.close();
		
		return inputed ;
	}

}
