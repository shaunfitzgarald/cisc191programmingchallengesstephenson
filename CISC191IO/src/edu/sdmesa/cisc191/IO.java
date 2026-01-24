package edu.sdmesa.cisc191;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

/**
* 
 * Lead Author(s):
 * @author Shaun Stephenson
 *  * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Gaddis, T. (2015). Starting out with Java: From control structures through objects. Addison-Wesley. 
 * 
 * File I/O Tutorial. (n.d.). Retrieved from http://www.cs.utexas.edu/~mitra/csSummer2009/cs303/lectures/fileIO.html
 * 
 * Eck, D. J. (2023). Introduction to Programming Using Java, Chapter 11. Retrieved from 
 * https://math.hws.edu/javanotes/
 * 
 * Gaddis, T. (2015). Introduction To File Input And Output. In Starting out with Java: From control 
 * structures through objects. Addison-Wesley.
 * 
 * TutorialsPoint. (n.d.). How to read a webpage with Java. Retrieved from 
 * https://www.tutorialspoint.com/java/java_networking.htm
 * 
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving, Sections 11.1-11.2, 
 * 11.3.1, 11.4. Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Essential Java: Chapter 8. (n.d.). Retrieved from https://www.essential-java.com/
 * 
 * Beginner's Book. (n.d.). Java I/O Tutorial with Examples. Retrieved from 
 * https://beginnersbook.com/java-io-tutorial-with-examples/
 * 
 * PrintWriter vs. PrintStream. (n.d.). Retrieved from https://www.baeldung.com/java-printwriter-vs-printstream
 *  
 * Version/date: 1.0/11-06-2025
 * 
 * Responsibilities of class:
 * This class is responsible for reading and writing files.
 */
public class IO
{
	// Hint: close operations must happen in a finally clause.
	
	/**
	 * Reads a file and returns its content as a string
	 * @param fileName the name of the file to read (w/filetype)
	 * @return the content of the file as a String, or empty String if file doesn't exist
	 */
	public static String readTestResults(String fileName)
	{
		// Setup file as File object
		File myFile = new File(fileName);
		
		// scanner
		Scanner scan = null;
		
		// try and catch block
		try {
			scan = new Scanner(myFile); // Create a scanner obj using the File object
			String content = ""; // Create a String to hold the content
			
			// Obtain content from the file as long as there is content to be obtained
			boolean firstLine = true;
			while (scan.hasNextLine()) {
				if (!firstLine) {
					content += "\n"; // Add newline between lines
				}
				content += scan.nextLine(); // Grab the content of the file through the Scanner
				firstLine = false;
			}
			
			return content;
		} catch (FileNotFoundException e) {
			// this runs if the file is not found
			// Returns a empty String if file doesn't exist
			return "";
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}
	
	/**
	 * Writes content to a file, overwriting if it exists
	 * @param fileName the name of the file to write to
	 * @param content the content to write to the file
	 */
	public static void startTestResults(String fileName, String content)
	{
		try {
			// create PrintWriter obj for a given filename
			PrintWriter outputFileWriter = new PrintWriter(fileName);
			
			// Write the content
			outputFileWriter.print(content);
			
			// Once you are done "writing", close the file
			outputFileWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot write file. File will not be written.");
		}
	}
	
	/**
	 * Appends content to a file
	 * @param fileName the name of the file to append to
	 * @param content the content to append to the file
	 */
	public static void appendTestResult(String fileName, String content)
	{
		try {
			// Create a PrintWriter object for a given filename with append mode
			PrintWriter outputFileWriter = new PrintWriter(new FileWriter(new File(fileName), true));
			
			// Write the content
			outputFileWriter.println(content);
			
			// Once you are done "writing", close the file
			outputFileWriter.close();
		} catch (Exception e) {
			System.out.println("Cannot write file. File will not be written.");
		}
	}
	
	/**
	 * Reads from a URL and extracts the dateTime field from the JSON response
	 * @param apiUrl the URL to read from
	 * @return the dateTime value as a String, or empty String if error occurs
	 */
	public static String readDateTime(String apiUrl)
	{
		Scanner scan = null; // Declare a Scanner object
		
		try {
			// Create url
			URL url = new URI(apiUrl).toURL();
			
			// create a Scanner object w/url
			scan = new Scanner(url.openStream());
			
			//  Grab the content line by line
			String content = "";
			while (scan.hasNextLine()) {
				content += scan.nextLine();
			}
			
			// extract the dateTime field from JSON
			// Look for "dateTime":" in the content
			int dateTimeIndex = content.indexOf("\"dateTime\":\"", 0);
			if (dateTimeIndex != -1) {
				// Find the start of the value (after "dateTime":"")
				int valueStart = dateTimeIndex + "\"dateTime\":\"".length();
				// Find the end of the value (next quote)
				int valueEnd = content.indexOf("\"", valueStart);
				if (valueEnd != -1) {
					return content.substring(valueStart, valueEnd);
				}
			}
			
			// Return the content (or empty if no dateTime)
			return "";
		} catch (Exception e) {
			// generalize the error you are catching
			return "";
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}
}
