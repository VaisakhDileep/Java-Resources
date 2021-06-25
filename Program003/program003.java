/*
Created by  : Vaisakh Dileep
Date		: 22, June, 2021
Description : This program helps to understand variables in Java.
*/
package Program003;

public class program003
{
// Variable: A variable is a piece of memory that can contain a data value. A variable is associated with a data type.

// Data type: A data type is an attribute of data which tells the compiler, how the programmer intends to use the data. Data types defines the operations that can be done on the data, the meaning of the data, and the way values of that type can be stored.

// Identifier: An identifier is the name used for naming classes, variables and methods.

/*
Rules for naming a variable:
1. All identifiers should begin with a letter(A-Z or a-z), currency character($) or an underscore(_).
2. After the first character, identifiers can have any combination of characters(A-Z or a-z or _ or $).
3. Keywords cannot be used as an identifiers.
5. Identifiers are case-sensitive
*/
	public static void main(String[] args)
	{
	// Integer variable:
		int int_variable = 10; // Declaration + Initialization

		System.out.println("int_variable: " + int_variable);
	}
}