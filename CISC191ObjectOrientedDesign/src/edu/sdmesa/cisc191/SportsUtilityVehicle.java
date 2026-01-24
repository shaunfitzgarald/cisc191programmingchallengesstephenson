package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Kodezi - 10 Java Object Oriented Examples to Boost Coding Skills
 * https://blog.kodezi.com/10-java-object-oriented-examples-to-boost-coding-skills/
 * 
 * JavaGuides - Object-Oriented Programming in Java with Examples
 * https://www.javaguides.net/p/object-oriented-design.html
 * 
 * LearningJava - Inheritance in Java Tutorial with Code Examples
 * https://www.learningjava.net/67/inheritance-in-java-tutorial-with-code-examples/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Represents a sports utility vehicle, which IS-A Vehicle with towing capacity
 */
public class SportsUtilityVehicle extends Vehicle
{
	// IS-A relationship: SportsUtilityVehicle IS-A Vehicle
	// HAS-A relationship: SportsUtilityVehicle has maximum towing weight
	private int maxTowingWeight;

	/**
	 * Constructor for SportsUtilityVehicle
	 * @param manufacturerName the manufacturer of the SUV
	 * @param milesOnVehicle the number of miles on the SUV
	 * @param price the price of the SUV
	 * @param numberOfSeats the number of seats in the SUV
	 * @param options array of options for the SUV
	 * @param maxTowingWeight the maximum towing weight of the SUV
	 */
	public SportsUtilityVehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int maxTowingWeight)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
		this.maxTowingWeight = maxTowingWeight;
	}

	/**
	 * Gets the maximum towing weight
	 * @return the maximum towing weight
	 */
	public int getMaxTowingWeight()
	{
		return maxTowingWeight;
	}
}

