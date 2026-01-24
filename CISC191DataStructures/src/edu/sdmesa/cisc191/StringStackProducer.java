package edu.sdmesa.cisc191;

import java.util.Stack;

public class StringStackProducer implements Producer<String>
{
	// this is where we store our stack of strings
	private Stack<String> stack;

	// constructor that takes a stack of strings
	public StringStackProducer(Stack<String> initialStrings)
	{
		// set our stack to the one that was passed in
		this.stack = initialStrings;
	}

	@Override
	public void produce(String item)
	{
		// add the new item to the top of the stack
		this.stack.push(item);
	}

	@Override
	public void produce(int index, String newString)
	{
		// this method is not typically used for stacks since elements are added to the top
		// for this implementation we just push to the top since stacks dont support indexed insertion
		this.stack.push(newString);
	}
}
