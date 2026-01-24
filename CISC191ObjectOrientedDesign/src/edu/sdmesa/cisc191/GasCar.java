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
 * GeeksforGeeks - Inheritance of Interface in Java with Examples
 * https://www.geeksforgeeks.org/java/inheritance-of-interface-in-java-with-examples/
 * 
 * LearningJava - Inheritance in Java Tutorial with Code Examples
 * https://www.learningjava.net/67/inheritance-in-java-tutorial-with-code-examples/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Represents a gas-powered car, which IS-A Car and IS-A Combustible
 */
public class GasCar extends Car implements Combustible
{
	// IS-A relationship: GasCar IS-A Car (which IS-A Vehicle)
	// IS-A relationship: GasCar IS-A Combustible
	// HAS-A relationship: GasCar has fuel level
	private int fuelLevel;

	/**
	 * Constructor for GasCar
	 * @param manufacturerName the manufacturer of the gas car
	 * @param milesOnVehicle the number of miles on the gas car
	 * @param price the price of the gas car
	 * @param numberOfSeats the number of seats in the gas car
	 * @param options array of options for the gas car
	 * @param numberOfDoors the number of doors on the gas car
	 */
	public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
		this.fuelLevel = 0;
	}

	/**
	 * Gets the current fuel level
	 * @return the fuel level (0-50)
	 */
	public int getFuelLevel()
	{
		return fuelLevel;
	}

	/**
	 * Adds fuel to the tank
	 * @param amount the amount of fuel to add (will not go past 50)
	 */
	public void addFuel(int amount)
	{
		fuelLevel += amount;
		if (fuelLevel > 50)
		{
			fuelLevel = 50;
		}
	}
}


