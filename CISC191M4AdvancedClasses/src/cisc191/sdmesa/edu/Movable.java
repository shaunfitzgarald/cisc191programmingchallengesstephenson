package cisc191.sdmesa.edu;

import java.util.Objects;

/**
 * Lead Author:
 * @author Shaun Stephenson
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 1.0/06-10-2025
 * 
 * Responsibilities of class:
 * 
 */
/**
 * Interface for objects that can move
 */
public interface Movable
{
	/**
	 * 
	 * @return the current speed
	 */
	int getSpeed();
	
	/**
	 * Increase the speed
	 */
	void speedUp();
}
