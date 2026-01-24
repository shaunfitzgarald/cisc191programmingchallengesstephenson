package edu.sdmesa.cisc191;

/**
 * @author Shaun Stephenson
 * Version/Date: 2.0/09-29-2025
 * 
 * References:
 * @see Java HashMap Tutorial - W3Schools.
 *      https://www.w3schools.com/java/java_hashmap.asp
 * @see HashMap in Java - GeeksforGeeks.
 *      https://www.geeksforgeeks.org/java-util-hashmap-in-java/
 * @see Java HashMap - Javatpoint.
 *      https://www.javatpoint.com/java-hashmap
 * @see Phone Directory Implementation - TutorialsPoint.
 *      https://www.tutorialspoint.com/java/java_hashmap_class.htm
 * @see Java Collections Framework - Oracle.
 *      https://docs.oracle.com/javase/tutorial/collections/
 * @see HashMap vs ArrayList Performance - Baeldung.
 *      https://www.baeldung.com/java-hashmap-vs-arraylist
 */
import java.util.HashMap;

public class PhoneDirectory
{
	// this hashmap stores names as keys and phone numbers as values
	private HashMap<String, Integer> directory;

	// constructor for our phone directory
	public PhoneDirectory()
	{
		// create a new empty hashmap when a phone directory is made
		this.directory = new HashMap<>();
	}

	// adds or updates a persons phone number in the directory
	public void setNumberForPerson(String person, Integer number)
	{
		// put the persons name and number into our directory
		this.directory.put(person, number);
	}

	// finds a persons phone number in the directory
	public Integer findNumberForPerson(String person)
	{
		// get the phone number for the person from our directory
		return this.directory.get(person);
	}

	// removes a person and their phone number from the directory
	public void forget(String person)
	{
		// remove the persons entry from our directory
		this.directory.remove(person);
	}
}
