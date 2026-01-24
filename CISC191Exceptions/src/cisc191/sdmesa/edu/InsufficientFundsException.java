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
 * Exception thrown when there are insufficient funds for a withdrawal
 * 
 */
public class InsufficientFundsException extends Exception
{
	private double amount;
	private double balance;
	
	/**
	 * Constructor that takes the withdrawal amount and current balance
	 * @param amount the amount attempted to withdraw
	 * @param balance the current balance in the account
	 */
	public InsufficientFundsException(double amount, double balance)
	{
		this.amount = amount;
		this.balance = balance;
	}
	
	/**
	 * Returns a message describing the insufficient funds error
	 * @return message string
	 */
	public String getMessage()
	{
		return "Withdrawing amount: $" + amount + " that is larger than balance: $" + balance + " is not allowed";
	}
}


