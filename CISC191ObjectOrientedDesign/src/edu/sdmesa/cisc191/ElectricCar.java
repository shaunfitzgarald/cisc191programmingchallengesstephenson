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
 * SitePoint - Interface and Inheritance in Java: Interface
 * https://www.sitepoint.com/interface-and-inheritance-in-java-interface/
 * 
 * LearningJava - Inheritance in Java Tutorial with Code Examples
 * https://www.learningjava.net/67/inheritance-in-java-tutorial-with-code-examples/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Represents an electric car, which IS-A Car and IS-A Chargeable
 */
public class ElectricCar extends Car implements Chargeable
{
	// IS-A relationship: ElectricCar IS-A Car (which IS-A Vehicle)
	// IS-A relationship: ElectricCar IS-A Chargeable
	// HAS-A relationship: ElectricCar has battery charge level
	private int batteryCharge;

	/**
	 * Constructor for ElectricCar
	 * @param manufacturerName the manufacturer of the electric car
	 * @param milesOnVehicle the number of miles on the electric car
	 * @param price the price of the electric car
	 * @param numberOfSeats the number of seats in the electric car
	 * @param options array of options for the electric car
	 * @param numberOfDoors the number of doors on the electric car
	 */
	public ElectricCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
		this.batteryCharge = 0;
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


