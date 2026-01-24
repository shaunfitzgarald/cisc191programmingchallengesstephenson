package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * TechChampion - Object-Oriented Design in Java: A Comprehensive Guide
 * https://tech-champion.com/general/object-oriented-design-in-java-a-comprehensive-guide/
 * 
 * JavaGuides - Object-Oriented Programming in Java with Examples
 * https://www.javaguides.net/p/object-oriented-design.html
 * 
 * JavaRevisited - Object-Oriented Programming Example in Java Tutorial
 * https://javarevisited.blogspot.com/2010/10/fundamentals-of-object-oriented.html
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Represents an option that can be added to a vehicle
 */
public class Option
{
	// HAS-A relationship: Option has details describing what it is
	private String details;

	/**
	 * Constructor for Option
	 * @param details the description of the option
	 */
	public Option(String details)
	{
		this.details = details;
	}

	/**
	 * Gets the details of the option
	 * @return the details of the option
	 */
	public String getDetails()
	{
		return details;
	}
}

