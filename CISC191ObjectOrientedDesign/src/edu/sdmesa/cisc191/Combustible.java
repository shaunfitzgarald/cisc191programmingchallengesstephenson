package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Oracle Java Tutorials - Lesson: Interfaces and Inheritance
 * https://docs.oracle.com/javase/tutorial/java/IandI/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Interface for objects that can use combustible fuel (like gas vehicles)
 */
public interface Combustible
{
	/**
	 * Gets the current fuel level
	 * @return the fuel level (0-50)
	 */
	int getFuelLevel();
	
	/**
	 * Adds fuel to the tank
	 * @param amount the amount of fuel to add (will not exceed 50)
	 */
	void addFuel(int amount);
}

