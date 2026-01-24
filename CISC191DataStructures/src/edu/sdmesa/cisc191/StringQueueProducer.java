package edu.sdmesa.cisc191;

import java.util.Queue;

public class StringQueueProducer implements Producer<String>
{
	// this is where we store our queue of strings
	private Queue<String> queue;

	// constructor that takes a queue of strings
	public StringQueueProducer(Queue<String> initialStrings)
	{
		// set our queue to the one that was passed in
		this.queue = initialStrings;
	}

	@Override
	public void produce(String item)
	{
		// add the new item to the back of the queue
		this.queue.offer(item);
	}

	@Override
	public void produce(int index, String newString)
	{
		// this method is not typically used for queues since elements are added to the end
		// for this implementation we just add to the end since queues dont support indexed insertion
		this.queue.offer(newString);
	}
}
