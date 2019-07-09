/*
 * TypeValidator
 * 
 * Version: 1.0
 * 
 * 08.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package z2.validators;

public class TypeValidator {
	
	//return true if input string has +- int number
	public static boolean isInt(String sequence)
	{
		if (sequence.matches("[+-]?\\d+"))
		{
			return true;
		}
		
		return false;
	}

}
