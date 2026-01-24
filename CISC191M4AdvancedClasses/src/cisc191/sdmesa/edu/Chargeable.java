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
 * Interface for objects that can be charged (electric vehicles)
 */
public interface Chargeable
{
	/**
	 * 
	 * @return the current charge level
	 */
	int getCharge();
	
	/**
	 * Charge the object to a specific level
	 * @param chargeLevel the level to charge to
	 */
	void chargeTo(int chargeLevel);
}
