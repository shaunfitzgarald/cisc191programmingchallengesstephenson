package edu.sdmesa.cisc191;

import java.util.*;

/**
 * Lead Author(s):
 * 
 * @author Shaun Stephenson
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * GeeksforGeeks. (n.d.). Recursion in Java. GeeksforGeeks.
 * Retrieved from https://www.geeksforgeeks.org/recursion-in-java/
 * 
 * GeeksforGeeks. (n.d.). Introduction to Recursion. GeeksforGeeks.
 * Retrieved from https://www.geeksforgeeks.org/introduction-to-recursion-2/
 * 
 * Cornell University. (n.d.). Developing a Recursive Method. CS Department, Cornell University.
 * Retrieved from https://www.cs.cornell.edu/courses/JavaAndDS/files/recursionDev.pdf
 * 
 * Wikipedia contributors. (n.d.). Recursion (computer science). Wikipedia, The Free Encyclopedia.
 * Retrieved from https://en.wikipedia.org/wiki/Recursion_(computer_science)
 * 
 * CodeHS. (n.d.). Basic Recursion Tutorial. CodeHS.
 * Retrieved from https://codehs.com/tutorial/david/basic-recursion
 * 
 * 
 * Version/date: 1.0/11-17-2025
 * 
 * Responsibilities of class:
 * 
 */
public class Recursion
{
	/**
	 * Add n to the sum of all integers less than n (but not negative)
	 * @param n
	 * @return the sum of n+(n-1)+...+1
	 */
	public static int addLess(final int n)
	{
		if (n <= 0)
		{
			// Base case
			return 0;
		}
		else if (n == 1)
		{
			// Base case
			return 1;
		}
		else
		{
			// Recursive case
			return n + addLess(n - 1);
		}
	}
	
	/**
	 * Multiply n by the product of all integers less than n (but not negative)
	 * @param n
	 * @return the product of n*(n-1)*...*1
	 */
	public static int multiplyLess(final int n)
	{
		if (n <= 1)
		{
			// Base case
			return 1;
		}
		else
		{
			// Recursive case
			return n * multiplyLess(n - 1);
		}
	}
	
	/**
	 * Calculate the n'th Lucas number.
	 * @param n the number of the Lucas number
	 * @return L(n) = L(n-2) + L(n-1)
	 */
	public static int lucas(final int n)
	{
		// Base cases
		if (n == 0)
		{
			return 2;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			// Recursive case
			return lucas(n - 2) + lucas(n - 1);
		}
	}
	
	/**
	 * Returns a list with a range of values from 0 to n (inclusive)
	 * @param n the ending value (inclusive)
	 * @return a LinkedList containing [0, 1, 2, ..., n]
	 */
	public static LinkedList<Integer> range(final int n)
	{
		if (n < 0)
		{
			// Base case: return empty list
			return new LinkedList<Integer>();
		}
		else
		{
			// Recursive case: create list with n, then add all previous values
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(n);
			list.addAll(0, range(n - 1));
			return list;
		}
	}
	
	/**
	 * Returns a list with a range of values from start to end (inclusive)
	 * @param start the starting value (inclusive)
	 * @param end the ending value (inclusive)
	 * @return a LinkedList containing [start, start+1, ..., end]
	 */
	public static LinkedList<Integer> range(final int start, final int end)
	{
		if (start > end)
		{
			// Base case: return empty list
			return new LinkedList<Integer>();
		}
		else
		{
			// Recursive case: create list with start, then add all remaining values
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(start);
			list.addAll(range(start + 1, end));
			return list;
		}
	}
	
	/**
	 * Reverse the order of elements in a list
	 * @param list the list to reverse
	 * @return a new LinkedList with elements in reverse order
	 */
	public static LinkedList<Integer> reverse(final LinkedList<Integer> list)
	{
		if (list == null || list.isEmpty())
		{
			// Base case: return empty list
			return new LinkedList<Integer>();
		}
		else if (list.size() == 1)
		{
			// Base case: return list with single element
			LinkedList<Integer> result = new LinkedList<Integer>();
			result.add(list.get(0));
			return result;
		}
		else
		{
			// Recursive case: get last element, reverse the rest, add last to front
			int lastElement = list.get(list.size() - 1);
			LinkedList<Integer> rest = new LinkedList<Integer>(list.subList(0, list.size() - 1));
			LinkedList<Integer> reversedRest = reverse(rest);
			LinkedList<Integer> result = new LinkedList<Integer>();
			result.add(lastElement);
			result.addAll(reversedRest);
			return result;
		}
	}
	
	/**
	 * Calculate the next Collatz number
	 * @param n the number to calculate from
	 * @return the next number in the Collatz sequence
	 */
	public static int nextCollatzNumber(int n)
	{
		if (n % 2 == 0)
		{
			// If n is even, return n/2
			return n / 2;
		}
		else
		{
			// If n is odd, return 3n+1
			return 3 * n + 1;
		}
	}
	
	/**
	 * Calculate an entire Collatz sequence given a starting number
	 * @param n starting number
	 * @return list of Collatz numbers starting with n
	 */
	public static LinkedList<Integer> collatzList(int n)
	{
		if (n == 1)
		{
			// Base case: stop recursion at n=1
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(1);
			return list; 
		}
		else
		{
			// Recursive case: add n, then add all remaining Collatz numbers
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(n);
			list.addAll(collatzList(nextCollatzNumber(n)));
			return list;
		}
	}
	
	/**
	 * Calculate the end balance given a starting balance, and interest rate
	 * (given as a decimal) and the number of times interest is added.
	 * 
	 * @param startBalance for the first period
	 * @param interestRate how much interest the money accrues each period; constant for all periods
	 * @param periods how many periods the money is invested (how many times interest is added; measured in months or years)
	 * @return ending balance how much is returned at the end of the last period
	 */
	public static double calculateEndBalance(final double startBalance,
			final double interestRate, final int periods)
	{
		if (periods == 0)
		{
			// Base case: no periods, return start balance
			return startBalance;
		}
		else
		{
			// Calculate the end balance for the first n-1 periods
			// The *start* balance for the current period is the *end* balance for the previous period (meaning periods-1)
			double startBalanceForNthPeriod = calculateEndBalance(startBalance, interestRate, periods - 1);
			// Then calculate the end balance for the current period by adding interest to the start balance
			return startBalanceForNthPeriod * (1 + interestRate);
		}
	}

	/**
	 * Calculate the ending population
	 * 
	 * @param startPopulation the starting population
	 * @param maxPopulation the maximum population that the environment will sustain
	 * @param growthRate starting growth rate, 0 < growthRate < 1
	 * @param periods that the population lives (number of days, months, or years)
	 * @return the ending population
	 */
	public static int calculateEndPopulation(final int startPopulation,final int maxPopulation, final double growthRate, final int periods)
	{
		if (periods == 0)
		{
			// Base case: no periods, return start population
			return startPopulation;
		}
		else
		{
			// Calculate the end population for the first n-1 periods:
			// The *start* population for the n'th period is the *end* population for the previous period
			double startPopulationForNthPeriod = calculateEndPopulation(startPopulation, maxPopulation, growthRate, periods - 1);
			// Calculate the growth rate for the current period (growth rate changes for each period)
			// The growth rate decreases as we approach max population: growthRate * (1 - currentPop/maxPop)
			double currentGrowthRate = growthRate * (1 - startPopulationForNthPeriod / maxPopulation);
			// Then calculate the end population for the current period by adding the growth for the current period.
			// Hint: make sure all calculations are done with doubles, otherwise there will be rounding errors
			double endPopulation = startPopulationForNthPeriod + startPopulationForNthPeriod * currentGrowthRate;
			return (int) endPopulation;
		}
	}

}
