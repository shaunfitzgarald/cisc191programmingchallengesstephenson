package cisc191.sdmesa.edu;

import java.io.Serializable;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 1.0/06-10-2025
 * 
 * Responsibilities of interface:
 * 
 */
public interface Gearable
{
	/**
	 * 
	 * @return the gear that object is currently in
	 */
	int getGear();
	
	/**
	 * Shift to a higher gear
	 */
	void gearUp();
	
	/**
	 * Shift to a lower gear
	 */
	void gearDown();
}
