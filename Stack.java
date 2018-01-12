//Author Peter Adamson

import java.util.Scanner;

public class Stack
{
	private int[] myStack = new int[10];
	private int size;

	public static void main(String[] args) throws Exception
	{
		String s = "";
		int i;
		Scanner sc = new Scanner(System.in);
		Stack test = new Stack();
		test.stack_init();
		System.out.println("enter a positive integer to push the value onto the stack");
		System.out.println("Enter a negative integer to return the value from the top of the stack");
		System.out.println("Enter 0 to remove the value from the top of the stack");
		do	//loops while the user has not input "n" or "N".  Continues to take user input while looping
		{
			System.out.println("Enter a value:");
			i = sc.nextInt();
			if(i > 0)
			{
				test.push(i);	
			}	
			else if(i==0)
			{
				test.pop();
			}
			else
			{
				test.top();
			}
			System.out.println("would you like to enter another value? (y/n)");
			s = sc.next();
		} while(!s.equals("n") && !s.equals("N"));
	}

	public void stack_init()
	{
		size = -1;
	}

	public boolean empty()
	{
		if(size == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void push(int val)
	{
		try
		{		
			{
				if(size==myStack.length-1)
				{
					throw new FullStackException("Stack is full");
				}				
				else
				{
					size += 1;
					myStack[size] = val;
				}
			}
		}
		catch(FullStackException e)
		{
			System.out.println(e);
		}
	}

	public void pop() throws EmptyStackException
	{
		try
		{
			if(size==-1)
			{
				throw new EmptyStackException("Stack is empty");
			}
			else
			{
				size -= 1;
			}
		}
		catch(EmptyStackException e)
		{
			System.out.println(e);
		}
	}

	public void top() throws EmptyStackException
	{
		try
		{
			if(size==-1)
			{
				throw new EmptyStackException("Stack is empty");
			}
			else
			{
				System.out.println(myStack[size]);
			}
		}
		catch(EmptyStackException e)
		{
			System.out.println("Stack is empty");
		}
	}	
}
