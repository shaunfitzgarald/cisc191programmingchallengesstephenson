package edu.sdmesa.cisc191;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
 * Alexander, A. (n.d.). Java JButton ActionListener Example.
 * Retrieved from https://alvinalexander.com/java/java-jbutton-tutorials-examples/
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Handles button click events for the fishing game
 */

public class FishingButtonListener implements ActionListener
{
	// Instance variables to maintain references to the model, view, and button
	private final GoneFishingModel model;
	private final GoneFishingView view;
	private final FishingButton button;

	/**
	 * Constructor for FishingButtonListener
	 * @param goneFishingModel the game model that tracks game state
	 * @param goneFishingView the view that displays the game
	 * @param fishingButton the button that was clicked
	 */
	public FishingButtonListener(GoneFishingModel goneFishingModel, GoneFishingView goneFishingView,
			FishingButton fishingButton)
	{
		this.model = goneFishingModel;
		this.view = goneFishingView;
		this.button = fishingButton;
	}

	/**
	 * Handles the action event when a fishing button is clicked
	 * @param e the action event
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Get the row and column from the button that was clicked
		int row = button.getRow();
		int column = button.getColumn();
		
		// Call the model's fishAt method to check if there's a fish at this location
		boolean foundFish = model.fishAt(row, column);
		
		// Update the button text based on whether a fish was found
		if (foundFish)
		{
			button.setText("Fish");
		}
		else
		{
			button.setText("X");
		}
		
		// Disable the button so it can't be clicked again
		button.setEnabled(false);
		
		// Update the UI to reflect any changes in the game state
		view.updateUI();
	}

}
