package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * @author 
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 1.0/06-10-2025
 * 
 * Responsibilities of class:
 * 
 */


public abstract class Cycle
{
	// TODO: Implement and comment HAS-A relationships separately
	
	// A cycle has a unique frame number, that is *immutable*;
	// How are you going to make it immutable, so that it only gets one final number? 
	// (Hint: did you see the hint?)
	private final int frameNumber;
	
	// A cycle has a make, that is immutable
	private final String make;
	
	// Static variable to track the next available frame number
	private static int nextFrameNumber = 1;
	
	
	public Cycle(String newMake)
	{
		this.make = newMake;
		this.frameNumber = nextFrameNumber++;
	}

	abstract int getNumberOfWheels();

	/**
	 * 
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the bike
	 * 
	 * @param newColor
	 */
	abstract void setColor(Color newColor);

	/**
	 * 
	 * @return make or brand that was set when the bike was made
	 */
	public String getMake()
	{
		return make;
	}
	
	/**
	 * 
	 * @return the unique serial number that was stamped in the frame when the bike was made
	 * @see https://www.eta.co.uk/bicycle-insurance/frequently-asked-questions/how-to-find-a-bicycle-frame-number/
	 */
	public int getFrameNumber()
	{
		return frameNumber;
	}
	
	/**
	 *  @return true if the frame number are the same
	 */
	@Override
	public boolean equals(Object other)
	{
		// Check if the object is the same reference
		if (this == other)
		{
			return true;
		}
		
		// Check if the object is null or not an instance of Cycle
		if (other == null || !(other instanceof Cycle))
		{
			return false;
		}
		
		// Cast to Cycle and compare frame numbers
		Cycle otherCycle = (Cycle) other;
		return this.frameNumber == otherCycle.frameNumber;
	}
	
	/**
	 * @return String describing the object, including type, make and frame number
	 */
	@Override
	public String toString()
	{
		return make + " (" + frameNumber + ")";
	}

}
