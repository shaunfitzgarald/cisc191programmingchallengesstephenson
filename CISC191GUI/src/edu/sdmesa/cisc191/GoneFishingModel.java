package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Oracle Corporation. (n.d.). Java Random Class Documentation.
 * Retrieved from https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
 * 
 * Oracle Corporation. (n.d.). Java Arrays Documentation.
 * Retrieved from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * 
 * Responsibilities of class: Tracks the game state and logic
 * 
 * Model and track the non-visual game play
 */

import java.util.Random;

// TODO: comment each method and each line of code to show you understand how it works

public class GoneFishingModel
{
	public static final int DIMENSION = 6;
	private boolean[][] grid = new boolean[DIMENSION][DIMENSION];
	private int triesRemaining = 30;
	private int fishRemaining = 10;

	/**
	 * TODO
	 */
	public GoneFishingModel()
	{
		Random randomNumberGenerator = new Random();
		for (int fishCounter = 0; fishCounter < fishRemaining; fishCounter++)
		{
			int row, column;
			do
			{
				row = randomNumberGenerator.nextInt(DIMENSION);
				column = randomNumberGenerator.nextInt(DIMENSION);
			} while (grid[row][column]);
			grid[row][column] = true;
		}
	}

	/**
	 * TODO
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean fishAt(int row, int column)
	{
		triesRemaining--;
		boolean foundFish = grid[row][column];
		if (foundFish)
		{
			fishRemaining--;
		}
		return foundFish;
	}

	/**
	 * TODO
	 * @return
	 */
	public int getTriesRemaining()
	{
		return triesRemaining;
	}

	/**
	 * TODO
	 * @return
	 */
	public int getFishRemaining()
	{
		return fishRemaining;
	}

	/**
	 * TODO
	 * @return
	 */
	public boolean fishWin()
	{
		return triesRemaining == 0 && fishRemaining > 0;
	}

	/**
	 * TODO
	 * @return
	 */
	public boolean playerWins()
	{
		return fishRemaining == 0;
	}
}
