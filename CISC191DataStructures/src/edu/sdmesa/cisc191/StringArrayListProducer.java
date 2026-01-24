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
 * This class implements the Producer interface for ArrayList data structure,
 * allowing items to be added to an ArrayList collection.
 * 
 */
import java.util.ArrayList;

public class StringArrayListProducer implements Producer<String>
{
	// This is where our list of strings will be stored
	private ArrayList<String> list;

	// constructor that takes an arraylist of strings
	public StringArrayListProducer(ArrayList<String> initialStrings) 
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

	public void produce(int index, String newString)
	{
		// Add the new string at a specific position (index) in our list
		this.list.add(index, newString); 
	}

}
