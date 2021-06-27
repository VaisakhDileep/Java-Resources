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
		System.out.println("Integer Maximum Value: " + max_int_value);

		System.out.println("Integer Minimum Value - 1: " + (min_int_value - 1)); // Integer underflow error(integer value becomes lesser than the minimum value that can be represented in its type).
		System.out.println("Integer Maximum Value + 1: " + (max_int_value + 1)); // Integer overflow error(integer value becomes greater than the maximum value that can be represented in its type).

		min_int_value = min_int_value - 1; // Integer underflow error happens here.
		max_int_value = max_int_value + 1; // Integer overflow error happens here.

		// min_int_value = -2147483649; // Compiler error happens when we are using integer literal that can result in an underflow.
		// max_int_value = 2147483648; // Compiler error happens when we are using integer literal that can result in an overflow.

		System.out.println("Size of int: " + Integer.BYTES); // Size of int is 4 bytes(32 bits).

		int bank_balance_1 = 10_00_000; // We can use '_' for better readability.

	// byte:
		byte min_byte_value = Byte.MIN_VALUE; // "Byte" is the wrapper class for "byte".
		byte max_byte_value = Byte.MAX_VALUE;

		System.out.println("Byte Minimum Value: " + min_byte_value);
		System.out.println("Byte Maximum Value: " + max_byte_value);

		System.out.println("Size of byte: " + Byte.BYTES + '\n'); // Size of byte is 1 byte(8 bits).

	// short:
		short min_short_value = Short.MIN_VALUE; // "Short" is the wrapper class for "short".
		short max_short_value = Short.MAX_VALUE;

		System.out.println("Short Minimum Value: " + min_short_value);
		System.out.println("Short Maximum Value: " + max_short_value);

		System.out.println("Size of short: " + Short.BYTES + '\n'); // Size of short is 2 bytes(16 bits).

	// long:
		long min_long_value = Long.MIN_VALUE; // "Long" is the wrapper class for "long".
		long max_long_value = Long.MAX_VALUE;

		System.out.println("Long Minimum Value: " + min_long_value);
		System.out.println("Long Maximum Value: " + max_long_value);

		System.out.println("Size of long: " + Long.BYTES); // Size of long is 8 bytes(64 bits).

		// long bank_balance_2 = 2_14_74_83_648; // This will give an error because we are using an int literal here and integer overflow happens.

		long bank_balance_3 = 2_14_74_83_648L; // This will work since we are using a long literal.
	}
}