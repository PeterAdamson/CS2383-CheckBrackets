//Author Peter Adamson

import java.util.Scanner;

public class CheckBrackets
{
	public static void main(String[] args) throws Exception
	{
		String s = "";
		Scanner sc = new Scanner(System.in);
		CheckBrackets test = new CheckBrackets();
		System.out.println("Enter a sequence of brackets to check validity");
		s = sc.next();
		if(test.check(s)==true)		//calls the check method to determine whether the sequence is valid or not
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

	public boolean check(String brackets) throws Exception
	{
		Stack myStack = new Stack();
		myStack.stack_init();			//initializes the stack
		for(int i=0; i < brackets.length();i++)
		{
			if(brackets.charAt(i)=='(')	//pushes a value onto the stack for every "("
			{
				myStack.push(i);
			}
			else if(brackets.charAt(i)==')')	//pops a value off the stack for ever ")"
			{
				if(myStack.empty()==false)
				{
					myStack.pop();
				}
				else
				{
					return false;
				}
			}
			else	//if there are any characters other than "(" or ")" returns false
			{
				return false;
			}
		}
		if(myStack.empty()==true)	//checks whether the stack is empty at the end or not
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
