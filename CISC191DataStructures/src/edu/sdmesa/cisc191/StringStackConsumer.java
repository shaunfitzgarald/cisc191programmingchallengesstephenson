package edu.sdmesa.cisc191;

import java.util.Stack;

public class StringStackConsumer implements Consumer<String>
{
	//where our stack of strings wil be stored
	private Stack<String> stack;

	// constructor that takes a stack of strings
	public StringStackConsumer(Stack<String> initialStrings)
	{
		// set our stack to the one that was passed in
		this.stack = initialStrings;
	}

	@Override
	public String consume()
	{
		// if the stack is empty, return null since theres nothing to consume
		if (this.stack.isEmpty())
		{
			return null;
		}
		// otherwise remove and return the item from the top of the stack
		return this.stack.pop();
	}
}
