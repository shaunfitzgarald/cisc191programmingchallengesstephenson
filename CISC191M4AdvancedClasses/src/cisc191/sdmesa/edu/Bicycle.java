package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 1.0/06-10-2025
 * 
 * Responsibilities of class:
 * A Bicycle is a Cycle with two wheels
 * 
 */

// IS-A relationship: Bicycle extends Cycle
public class Bicycle extends Cycle
{
	// HAS-A relationship: A Bicycle has-a color
	private Color color;
	
	// TODO: Consider adding gear functionality
	
	public Bicycle(String newMake)
	{
		super(newMake);
	}

	@Override
	public int getNumberOfWheels()
	{
		return 2;
	}

	@Override
	public Color getColor()
	{
		return color;
	}

	@Override
	public void setColor(Color newColor) {
		this.color = newColor;
	}
}
