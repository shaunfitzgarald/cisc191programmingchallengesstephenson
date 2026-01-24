package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * JavaGuides - Object-Oriented Programming in Java with Examples
 * https://www.javaguides.net/p/object-oriented-design.html
 * 
 * LearningJava - Inheritance in Java Tutorial with Code Examples
 * https://www.learningjava.net/67/inheritance-in-java-tutorial-with-code-examples/
 * 
 * TechChampion - Object-Oriented Design in Java: A Comprehensive Guide
 * https://tech-champion.com/general/object-oriented-design-in-java-a-comprehensive-guide/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Base class for all vehicles with common properties like manufacturer, miles, price, seats, and options
 */

public class Vehicle
{
	// HAS-A relationship: Vehicle has a manufacturer name
	private String manufacturerName;
	
	// HAS-A relationship: Vehicle has miles on it
	private int milesOnVehicle;
	
	// HAS-A relationship: Vehicle has a price
	private int price;
	
	// HAS-A relationship: Vehicle has a number of seats
	private int numberOfSeats;
	
	// HAS-A relationship: Vehicle has an array of options
	private Option[] options;

	/**
	 * Constructor for Vehicle
	 * @param manufacturerName the manufacturer of the vehicle
	 * @param milesOnVehicle the number of miles on the vehicle
	 * @param price the price of the vehicle
	 * @param numberOfSeats the number of seats in the vehicle
	 * @param options array of options for the vehicle
	 */
	public Vehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options)
	{
		this.manufacturerName = manufacturerName;
		this.milesOnVehicle = milesOnVehicle;
		this.price = price;
		this.numberOfSeats = numberOfSeats;
		this.options = options;
	}

	/**
	 * Gets the manufacturer name
	 * @return the manufacturer name
	 */
	public String getManufacturerName()
	{
		return manufacturerName;
	}

	/**
	 * Gets the miles on the vehicle
	 * @return the miles on the vehicle
	 */
	public int getMilesOnVehicle()
	{
		return milesOnVehicle;
	}

	/**
	 * Gets the price of the vehicle
	 * @return the price of the vehicle
	 */
	public int getPrice()
	{
		return price;
	}

	/**
	 * Gets the number of seats
	 * @return the number of seats
	 */
	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}

	/**
	 * Gets the options array
	 * @return the options array
	 */
	public Option[] getOptions()
	{
		return options;
	}
}
