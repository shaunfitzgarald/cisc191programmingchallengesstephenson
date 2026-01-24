package edu.sdmesa.cisc191;

/**
 * @author Shaun Stephenson
 * Version/Date: 2.0/09-29-2025
 * 
 * References:
 * @see Palindrome Algorithm using Stack and Queue - GeeksforGeeks.
 *      https://www.geeksforgeeks.org/check-whether-the-given-string-is-palindrome-using-stack/
 * @see Java Stack Tutorial - W3Schools.
 *      https://www.w3schools.com/java/java_stack.asp
 * @see Java Queue Tutorial - W3Schools.
 *      https://www.w3schools.com/java/java_queue.asp
 * @see Stack vs Queue in Java - Baeldung.
 *      https://www.baeldung.com/java-stack-vs-queue
 * @see Java Stack Class - Javatpoint.
 *      https://www.javatpoint.com/java-stack
 * @see Java Queue Interface - Javatpoint.
 *      https://www.javatpoint.com/java-queue
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; // We need LinkedList to implement the Queue

public class Palindrome
{
	public static boolean isPalindrome(char[] letters)
	{
		// create a stack to store characters (last in first out)
		Stack<Character> stack = new Stack<>();
		// create a queue to store characters (first in first out)
		Queue<Character> queue = new LinkedList<>();

		// go through each letter in the input array
		for (char letter : letters)
		{
			// add the current letter to both the stack and queue
			stack.push(letter);
			queue.offer(letter);
		}

		// while there are still elements in the queue
		while (!queue.isEmpty())
		{
			// take a letter from the front of queue and top of stack
			// if they dont match, its not a palindrome
			if (stack.pop() != queue.poll())
			{
				return false; // not a palindrome
			}
		}

		// if we went through all letters and they matched, its a palindrome
		return true;
	}
	
}
