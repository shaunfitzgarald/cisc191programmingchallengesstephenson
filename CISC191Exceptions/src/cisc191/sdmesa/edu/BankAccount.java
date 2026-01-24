package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 1.0/11-02-2025
 * 
 * Responsibilities of class:
 * 
 */
/**
 */
public class BankAccount
{
	// A bank account has a current balance starting at $0.00
	private double balance = 0;

	/**
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * Deposit amount into account
	 * 
	 * @param amount to deposit
	 * @throws InvalidAmountException is thrown if amount is not positive
	 */
	public void deposit(double amount) throws InvalidAmountException
	{
		if (amount <= 0) {
			throw new InvalidAmountException(amount);
		}
		balance += amount;
	}

	/**
	 * Withdraw amount from account
	 * 
	 * @param amount to withdraw
	 * @throws InvalidAmountException     is thrown if amount is not positive
	 * @throws InsufficientFundsException is thrown if there is not enough funds in
	 *                                    the account to make the withdrawal
	 */
	public void withdraw(double amount) throws Exception
	{
		if (amount <= 0) {
			throw new InvalidAmountException(amount);
		}
		if (amount > balance) {
			throw new InsufficientFundsException(amount, balance);
		}
		balance -= amount;
	}

	/**
	 * Withdraw amount requested or the biggest amount possible
	 * 
	 * @return the amount actually withdrawn
	 * @throws InvalidAmountException     is thrown if amount is not positive
	 */
	public double withdrawAsMuchPossible(double requestAmount) throws InvalidAmountException
	{
		if (requestAmount <= 0) {
			throw new InvalidAmountException(requestAmount);
		}
		
		// Try to withdraw the requested amount
		try {
			withdraw(requestAmount);
			return requestAmount;
		} catch (Exception e) {
			// If it fails, get as much as possible
			double amountWithdrawn = balance;
			if (balance > 0) {
				balance = 0;
			}
			return amountWithdrawn;
		}
	}

}
