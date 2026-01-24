package edu.sdmesa.cisc191;
/**
 * @author Shaun Stephenson
 * Version/Date: 2.0/09-29-2025
 * 
 * References:
 * @see Java ArrayList Tutorial - W3Schools.
 *      https://www.w3schools.com/java/java_arraylist.asp
 * @see ArrayList in Java - GeeksforGeeks.
 *      https://www.geeksforgeeks.org/arraylist-in-java/
 * @see Java ArrayList - Javatpoint.
 *      https://www.javatpoint.com/java-arraylist
 * @see Java ArrayList vs LinkedList - Baeldung.
 *      https://www.baeldung.com/java-arraylist-vs-linkedlist
 * @see Java Collections Framework - Oracle.
 *      https://docs.oracle.com/javase/tutorial/collections/
 * @see Java Data Structures - TutorialsPoint.
 *      https://www.tutorialspoint.com/java_data_structures/index.htm
 * @see Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Responsibilities of class:
 * This class implements the Consumer interface for ArrayList data structure,
 * allowing items to be removed from an ArrayList collection.
 * 
 */
import java.util.ArrayList;

public class StringArrayListConsumer implements Consumer<String>
{
	// this is where we store our list of strings
	private ArrayList<String> list;

	// constructor that takes an arraylist of strings
	public StringArrayListConsumer(ArrayList<String> initialStrings) 
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
		// Otherwise, remove and return the first item from the list
		return this.list.remove(0);

	}

}
