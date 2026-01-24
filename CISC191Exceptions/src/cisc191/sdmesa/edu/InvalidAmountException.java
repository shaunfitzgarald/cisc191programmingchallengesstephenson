package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 1.0/11-02-2025
 * 
 * Responsibilities of class:
 * Exception thrown when an invalid amount is used for a bank transaction
 * 
 */
public class InvalidAmountException extends Exception
{
	private double amount;
	
	/**
	 * Constructor that takes the invalid amount
	 * @param amount the invalid amount that caused the exception
	 */
	public InvalidAmountException(double amount)
	{
		this.amount = amount;
	}
	
	/**
	 * Returns a message describing the invalid amount
	 * @return message string
	 */
	public String getMessage()
	{
		return "Negative amount: $" + amount + " is not allowed";
	}
}


