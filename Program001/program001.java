/*
Created by  : Vaisakh Dileep
Date		: 21, June, 2021
Description : This program prints "Hello, World!" in Java.
*/
package Program001;

public class program001
{
// Method: A method is a collection of statements that perform an operation.
	public static void main(String[] args) // This is the main() method, it is the entry point for any java program.
	{
	// public: It is an access modifier, public makes main() method globally available.
	// static: static makes the main() method class-related, so JVM can invoke it without instantiating the class. This will save unnecessary wastage of memory.
	// void: It specifies that the main() method does not return anything. As soon as the main() method terminates, the java program terminates, so there is no point in returning anything.

		System.out.println("Hello, World!");
	}
}