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
 * Represents a pickup truck, which IS-A Vehicle with cargo capacity
 */
public class PickupTruck extends Vehicle
{
	// IS-A relationship: PickupTruck IS-A Vehicle
	// HAS-A relationship: PickupTruck has cargo capacity
	private int cargoCapacity;

	/**
	 * Constructor for PickupTruck
	 * @param manufacturerName the manufacturer of the pickup truck
	 * @param milesOnVehicle the number of miles on the pickup truck
	 * @param price the price of the pickup truck
	 * @param numberOfSeats the number of seats in the pickup truck
	 * @param options array of options for the pickup truck
	 * @param cargoCapacity the cargo capacity of the pickup truck
	 */
	public PickupTruck(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int cargoCapacity)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
		this.cargoCapacity = cargoCapacity;
	}

	/**
	 * Gets the cargo capacity
	 * @return the cargo capacity
	 */
	public int getCargoCapacity()
	{
		return cargoCapacity;
	}
}

