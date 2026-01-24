package edu.sdmesa.cisc191;

import java.util.LinkedList;

public class StringLinkedListProducer implements Producer<String>
{
	// This is where our list of strings wil be stored
	private LinkedList<String> list;

	// constructor that takes a linkedlist of strings
	public StringLinkedListProducer(LinkedList<String> initialStrings)
	{
		// set our list to the one that was passed in
		this.list = initialStrings;
	}

	@Override
	public void produce(String item)
	{
		// add the new item to the end of the list
		this.list.add(item);
	}

	@Override
	public void produce(int index, String newString)
	{
		// add the string at a specific position in the list
		this.list.add(index, newString);
	}
}
