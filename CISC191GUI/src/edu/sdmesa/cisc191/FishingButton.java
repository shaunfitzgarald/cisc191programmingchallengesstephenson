package edu.sdmesa.cisc191;

import javax.swing.JButton;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Oracle Corporation. (n.d.). How to Use Buttons, Check Boxes, and Radio Buttons.
 * Retrieved from https://docs.oracle.com/javase/tutorial/uiswing/components/button.html
 * 
 * CodeJava. (n.d.). JButton Basic Tutorial and Examples.
 * Retrieved from https://www.codejava.net/java-se/swing/jbutton-basic-tutorial-and-examples
 * 
 * Learning Java. (n.d.). Working with JButton in Java Swing Tutorial.
 * Retrieved from https://www.learningjava.net/270/working-with-jbutton-in-java-swing-tutorial/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Represents a button in the fishing game grid
 */

public class FishingButton extends JButton
{
	// Instance variables to track the button's position in the grid
	private final int row;
	private final int column;

	/**
	 * Constructor for FishingButton
	 * @param row the row position of this button in the grid
	 * @param column the column position of this button in the grid
	 */
	public FishingButton(int row, int column)
	{
		this.row = row;
		this.column = column;
		// Set initial text to show unclicked state
		setText("?");
	}

	/**
	 * Getter for the row position
	 * @return the row position of this button
	 */
	public int getRow()
	{
		return row;
	}

	/**
	 * Getter for the column position
	 * @return the column position of this button
	 */
	public int getColumn()
	{
		return column;
	}

}
