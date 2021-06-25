/*
Created by  : Vaisakh Dileep
Date		: 22, June, 2021
Description : This program helps to understand statements in Java.
*/
package Program002;

public class program002
{
/*
Statement: Statement specifies an action in a Java Program.
There are three types of statements:
1. Declaration statement: Declares variables.
2. Control-flow Statement: Implements branching or looping certain sections of code based on certain conditions.
3. Expression statement: Changes value of variables, call methods and create objects.
*/
	public static void main(String[] args)
	{
		int flag; // This is a declaration statement.

		flag = 7; // This is an expression statement.
	
		if(flag < 10) // This is a control-flow statement.
		{
			System.out.println("int_variable is less than 10.");
		}
	}
}