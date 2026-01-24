package edu.sdmesa.cisc191;

import java.util.LinkedList;

public class StringLinkedListConsumer implements Consumer<String>
{
	// this is where we store our list of strings
	private LinkedList<String> list;

	// Constructor for our consumer, takes a LinkedList of strings
	public StringLinkedListConsumer(LinkedList<String> initialStrings)
	{
		// set our list to the one that was passed in
		this.list = initialStrings;
	}

	@Override
	public String consume()
	{
		// if the list is empty, return null since theres nothing to consume
		if (this.list.isEmpty())
		{
			return null;
		}
		// otherwise remove and return the first item from the list
		return this.list.remove(0);
	}
}
