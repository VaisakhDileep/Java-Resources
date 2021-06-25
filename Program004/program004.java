/*
Created by  : Vaisakh Dileep
Date		: 22, June, 2021
Description : This program helps to understand literals in Java.
*/
package Program004;

public class program004
{
// Literal: A literal is any constant value which can be assigned to a variable.
	public static void main(String[] args)
	{
		int int_variable_1 = 25; // Here 25 is a literal(decimal).
		int int_variable_2 = 031; // Here 031 is a literal(octal).
		int int_variable_3 = 0X19; // Here 0X19(0x19) is a literal(hexadecimal).
		int int_variable_4 = 0B11001; // Here 0b11001(0B11001) is a literal(binary).

		double double_variable = 25.25; // Here 25.25 is a literal.

		char char_variable_1 = 'a'; // Here 'a' is a literal.
		char char_variable_2 = 35169; // Here 35169(Unicode Decimal) is a literal. Refer: http://www.tamasoft.co.jp/en/general-info/unicode-decimal.html
		char char_variable_3 = 0104541; // Here 0104541 is a literal
		char char_variable_4 = 0X8961; // Here 0X8961(0x8961) is a literal.
		char char_variable_5 = 0B1000100101100001; // Here 0B1000100101100001(0b1000100101100001) is a literal.
		char char_variable_6 = '\u8961'; // Here '\u8961(Unicode character)' is a literal.
		char char_variable_7 = '\t'; // Here '\t'(escape character) is a literal.

		String string_variable = "The Simpsons"; // Here "The Simpsons" is a literal.

		Boolean boolean_variable = true; // Here "true" is a literal.

		System.out.println("int_variable_1: " + int_variable_1);
		System.out.println("int_variable_2: " + int_variable_2);
		System.out.println("int_variable_3: " + int_variable_3);
		System.out.println("int_variable_4: " + int_variable_4 + '\n');

		System.out.println("double_variable: " + double_variable + '\n');

		System.out.println("char_variable_1: " + char_variable_1);
		System.out.println("char_variable_2: " + char_variable_2);
		System.out.println("char_variable_3: " + char_variable_3);
		System.out.println("char_variable_4: " + char_variable_4);
		System.out.println("char_variable_5: " + char_variable_5);
		System.out.println("char_variable_6: " + char_variable_6);
		System.out.println("char_variable_7: " + char_variable_7 + '\n');

		System.out.println("string_variable: " + string_variable + '\n');

		System.out.println("boolean_variable: " + boolean_variable + '\n');
	}
}