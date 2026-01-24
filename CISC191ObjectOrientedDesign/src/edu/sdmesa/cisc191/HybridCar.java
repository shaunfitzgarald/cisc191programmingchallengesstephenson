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
 * FreeCodeCamp - Object-Oriented Design Patterns with Java
 * https://www.freecodecamp.org/news/object-oriented-design-patterns-with-java/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Represents a hybrid car, which IS-A Car, IS-A Combustible, and IS-A Chargeable
 */
public class HybridCar extends Car implements Combustible, Chargeable
{
	// IS-A relationship: HybridCar IS-A Car (which IS-A Vehicle)
	// IS-A relationship: HybridCar IS-A Combustible
	// IS-A relationship: HybridCar IS-A Chargeable
	// HAS-A relationship: HybridCar has fuel level
	private int fuelLevel;
	// HAS-A relationship: HybridCar has battery charge level
	private int batteryCharge;

	/**
	 * Constructor for HybridCar
	 * @param manufacturerName the manufacturer of the hybrid car
	 * @param milesOnVehicle the number of miles on the hybrid car
	 * @param price the price of the hybrid car
	 * @param numberOfSeats the number of seats in the hybrid car
	 * @param options array of options for the hybrid car
	 * @param numberOfDoors the number of doors on the hybrid car
	 */
	public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
		this.fuelLevel = 0;
		this.batteryCharge = 0;
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
	 * @param amount the amount of fuel to add (will not exceed 50)
	 */
	public void addFuel(int amount)
	{
		fuelLevel += amount;
		if (fuelLevel > 50)
		{
			fuelLevel = 50;
		}
	}

	/**
	 * Gets the current battery charge level
	 * @return the battery charge level (0-100)
	 */
	public int getBatteryCharge()
	{
		return batteryCharge;
	}

	/**
	 * Charges up the battery by the specified amount
	 * @param amount the amount to charge (will not exceed 100)
	 */
	public void chargeUp(int amount)
	{
		batteryCharge += amount;
		if (batteryCharge > 100)
		{
			batteryCharge = 100;
		}
	}
}


