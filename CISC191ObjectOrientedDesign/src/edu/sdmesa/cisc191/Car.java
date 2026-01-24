package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * FreeCodeCamp - Object-Oriented Design Patterns with Java
 * https://www.freecodecamp.org/news/object-oriented-design-patterns-with-java/
 * 
 * Kodezi - 10 Java Object Oriented Examples to Boost Coding Skills
 * https://blog.kodezi.com/10-java-object-oriented-examples-to-boost-coding-skills/
 * 
 * LearningJava - Inheritance in Java Tutorial with Code Examples
 * https://www.learningjava.net/67/inheritance-in-java-tutorial-with-code-examples/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Represents a car, which IS-A Vehicle with additional door count property
 */
public class Car extends Vehicle
{
	// IS-A relationship: Car IS-A Vehicle
	// HAS-A relationship: Car has a number of doors
	private int numberOfDoors;

	/**
	 * Constructor for Car
	 * @param manufacturerName the manufacturer of the car
	 * @param milesOnVehicle the number of miles on the car
	 * @param price the price of the car
	 * @param numberOfSeats the number of seats in the car
	 * @param options array of options for the car
	 * @param numberOfDoors the number of doors on the car
	 */
	public Car(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * Gets the number of doors
	 * @return the number of doors
	 */
	public int getNumberOfDoors()
	{
		return numberOfDoors;
	}
}

