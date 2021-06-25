/*
Created by  : Vaisakh Dileep
Date		: 25, June, 2021
Description : This program helps to understand primitive data types in Java.
*/
package Program005;

public class program005
{
/*
Primitive data types: They are the most basic data types.
The primitive data types are:
1. boolean
2. byte
3. char
4. short
5. int
6. long
7. float
8. double
*/
public static void main(String args[])
	{
	// int:
		int min_int_value = Integer.MIN_VALUE; // "Integer" is the wrapper class for "int". Wrapper class is a class whose object wraps or contains primitive data types.
		int max_int_value = Integer.MAX_VALUE;

		System.out.println("Integer Minimum Value: " + min_int_value);
		System.out.println("Integer Maximum Value: " + max_int_value + '\n');

		System.out.println("Integer Minimum Value - 1: " + (min_int_value - 1)); // Integer underflow error(integer value becomes lesser than the minimum value that can be represented in its type).
		System.out.println("Integer Maximum Value + 1: " + (max_int_value + 1) + '\n'); // Integer overflow error(integer value becomes greater than the maximum value that can be represented in its type).

		min_int_value = min_int_value - 1; // Integer underflow error happens here.
		max_int_value = max_int_value + 1; // Integer overflow error happens here.

		// min_int_value = -2147483649; // Compiler error happens when we are using integer literal that can result in an underflow.
		// max_int_value = 2147483648; // Compiler error happens when we are using integer literal that can result in an overflow.

		int bank_balance = 10_00_000; // We can use '_' for better readability.

		System.out.println("Bank Balance: " + bank_balance + '\n');
	}
}