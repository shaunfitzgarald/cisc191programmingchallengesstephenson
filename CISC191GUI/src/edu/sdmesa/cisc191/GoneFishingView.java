package edu.sdmesa.cisc191;

import java.awt.*;
import javax.swing.*;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Oracle Corporation. (n.d.). Creating the CelsiusConverter GUI.
 * Retrieved from https://docs.oracle.com/javase/tutorial/uiswing/learn/creatinggui.html
 * 
 * Oracle Corporation. (n.d.). Using Layout Managers.
 * Retrieved from https://docs.oracle.com/javase/tutorial/uiswing/layout/using.html
 * 
 * TutorialsPoint. (n.d.). SWING - BorderLayout Class.
 * Retrieved from https://www.tutorialspoint.com/swing/swing_borderlayout.htm
 * 
 * CodeHS. (n.d.). Basic Java Swing Layouts.
 * Retrieved from https://codehs.com/tutorial/18101
 *  
 * Version/date: 1.0/10-13-2025
 * 
 * Responsibilities of class:
 * Creates and manages the GUI for the Gone Fishing game
 */

public class GoneFishingView extends JFrame
{
	// Instance variable to hold reference to the game model
	private final GoneFishingModel model;
	
	// GUI components
	private JSlider triesSlider;
	private JSlider fishSlider;
	private JLabel triesLabel;
	private JLabel fishLabel;

	/**
	 * Constructor for GoneFishingView
	 * @param model the game model that tracks game state
	 */
	public GoneFishingView(GoneFishingModel model)
	{
		this.model = model;
		
		// Set the window title
		setTitle("Gone Fishing");
		
		// Set the layout manager to BorderLayout
		setLayout(new BorderLayout());
		
		// Create and add the instruction panel to the WEST
		createInstructionPanel();
		
		// Create and add the fishing panel to the CENTER
		createFishingPanel();
		
		// Create and add the slider panel to the EAST
		createSliderPanel();
		
		// Create and add the bottom panel to the SOUTH
		createBottomPanel();
		
		// Set minimum size to prevent buttons from being too small
		setMinimumSize(new Dimension(600, 400));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	/**
	 * Creates the instruction panel and adds it to the WEST
	 */
	private void createInstructionPanel()
	{
		JPanel instructionPanel = new JPanel();
		JLabel instructionLabel = new JLabel("Click on the buttons to fish");
		instructionPanel.add(instructionLabel);
		add(instructionPanel, BorderLayout.WEST);
	}

	/**
	 * Creates the fishing panel with buttons in a grid and adds it to the CENTER
	 */
	private void createFishingPanel()
	{
		JPanel fishingPanel = new JPanel();
		fishingPanel.setLayout(new GridLayout(GoneFishingModel.DIMENSION, GoneFishingModel.DIMENSION));
		
		// Create buttons in a nested loop to fill the grid
		for (int row = 0; row < GoneFishingModel.DIMENSION; row++)
		{
			for (int column = 0; column < GoneFishingModel.DIMENSION; column++)
			{
				// Create a FishingButton
				FishingButton fish = new FishingButton(row, column);
				
				// Connect the listener
				fish.addActionListener(new FishingButtonListener(model, this, fish));
				
				// Add the button to the panel
				fishingPanel.add(fish);
			}
		}
		
		add(fishingPanel, BorderLayout.CENTER);
	}

	/**
	 * Creates the slider panel and adds it to the EAST
	 */
	private void createSliderPanel()
	{
		JPanel sliderPanel = new JPanel();
		sliderPanel.setLayout(new GridLayout(2, 1));
		
		// Create tries slider
		triesSlider = new JSlider(JSlider.VERTICAL, 0, 30, 30);
		triesSlider.setMajorTickSpacing(10);
		triesSlider.setMinorTickSpacing(5);
		triesSlider.setPaintTicks(true);
		triesSlider.setPaintLabels(true);
		triesSlider.setEnabled(false); // Disable so user can't manually change it
		
		// Create fish slider
		fishSlider = new JSlider(JSlider.VERTICAL, 0, 10, 10);
		fishSlider.setMajorTickSpacing(5);
		fishSlider.setMinorTickSpacing(1);
		fishSlider.setPaintTicks(true);
		fishSlider.setPaintLabels(true);
		fishSlider.setEnabled(false); // Disable so user can't manually change it
		
		// Create labels for the sliders
		triesLabel = new JLabel("Tries");
		fishLabel = new JLabel("Fish");
		
		// Add components to the panel
		sliderPanel.add(triesLabel);
		sliderPanel.add(triesSlider);
		sliderPanel.add(fishLabel);
		sliderPanel.add(fishSlider);
		
		add(sliderPanel, BorderLayout.EAST);
	}

	/**
	 * Creates the bottom panel and adds it to the SOUTH
	 */
	private void createBottomPanel()
	{
		JPanel bottomPanel = new JPanel();
		JLabel programmerLabel = new JLabel("Programmed by: Shaun Stephenson");
		bottomPanel.add(programmerLabel);
		add(bottomPanel, BorderLayout.SOUTH);
	}

	/**
	 * Starts the game
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		new GoneFishingView(new GoneFishingModel());
	}

	/**
	 * Updates the UI to reflect the current game state
	 */
	public void updateUI()
	{
		// Update the sliders with current values from the model
		triesSlider.setValue(model.getTriesRemaining());
		fishSlider.setValue(model.getFishRemaining());
		
		// Check for game over conditions
		if (model.playerWins())
		{
			JOptionPane.showMessageDialog(this, "Game Over - You Win!", "Message", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if (model.fishWin())
		{
			JOptionPane.showMessageDialog(this, "Game Over - Fishes Win!", "Message", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
