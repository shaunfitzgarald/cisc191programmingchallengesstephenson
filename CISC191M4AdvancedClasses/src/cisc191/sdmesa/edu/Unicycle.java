package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 1.0/06-10-2025
 * 
 * Responsibilities of class:
 * A Unicycle is a Cycle with only one wheel
 * 
 * @version 1.0
 * @since 2024
 */

 // IS-A relationship: Unicycle extends Cycle
public class Unicycle extends Cycle
{
	// HAS-A relationship: A Unicycle has-a color
	private Color color;
	
	// TODO: Add validation for color parameter
	
	public Unicycle(String newMake)
	{
		super(newMake);
	}

	@Override
	public int getNumberOfWheels() {
		return 1;
	}

	@Override
	public Color getColor()
	{
		return color;
	}

	@Override
	public void setColor(Color newColor)
	{
		this.color = newColor;
	}
}
