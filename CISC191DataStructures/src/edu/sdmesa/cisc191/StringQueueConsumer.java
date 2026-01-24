package edu.sdmesa.cisc191;

import java.util.Queue;

public class StringQueueConsumer implements Consumer<String>
{
	// this is where we store our queue of strings
	private Queue<String> queue;

	// constructor that takes a queue of strings
	public StringQueueConsumer(Queue<String> initialStrings)
	{
		// set our queue to the one that was passed in
		this.queue = initialStrings;
	}

	@Override
	public String consume()
	{
		// if the queue is empty, return null since theres nothing to consume
		if (this.queue.isEmpty())
		{
			return null;
		}
		// otherwise remove and return the item from the front of the queue
		return this.queue.poll();
	}
}
