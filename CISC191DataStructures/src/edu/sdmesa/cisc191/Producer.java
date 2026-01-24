package edu.sdmesa.cisc191;

/**
 * @author Shaun Stephenson
 * Version/Date: 2.0/09-29-2025
 * 
 * References:
 * @see Java Generics Tutorial - Oracle.
 *      https://docs.oracle.com/javase/tutorial/java/generics/
 * @see Java Interface Tutorial - W3Schools.
 *      https://www.w3schools.com/java/java_interface.asp
 * @see Java Interfaces - TutorialsPoint.
 *      https://www.tutorialspoint.com/java/java_interfaces.htm
 * @see Java Generics - Javatpoint.
 *      https://www.javatpoint.com/java-generics
 * @see Producer Consumer Pattern in Java - GeeksforGeeks.
 *      https://www.geeksforgeeks.org/producer-consumer-solution-using-threads-java/
 * @see Java Interface vs Abstract Class - Baeldung.
 *      https://www.baeldung.com/java-interface-vs-abstract-class
 */
public interface Producer<Item>
{
	/**
	 * Adds an element from the collection; making it available for consumption.
	 */
	public void produce(Item item);
	
	/**
	 * Adds an element at a specific index in the collection, making it available for consumption.
	 */
	public void produce(int index, Item item);
}