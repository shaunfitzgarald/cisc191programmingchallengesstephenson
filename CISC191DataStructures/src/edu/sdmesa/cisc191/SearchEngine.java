package edu.sdmesa.cisc191;

/**
 * @author Shaun Stephenson
 * Version/Date: 2.0/09-29-2025
 * 
 * References:
 * @see Search Engine Implementation with HashMap - GeeksforGeeks.
 *      https://www.geeksforgeeks.org/java-util-hashmap-in-java/
 * @see Java HashMap Tutorial - W3Schools.
 *      https://www.w3schools.com/java/java_hashmap.asp
 * @see Java ArrayList Tutorial - W3Schools.
 *      https://www.w3schools.com/java/java_arraylist.asp
 * @see HashMap with ArrayList Values - Baeldung.
 *      https://www.baeldung.com/java-hashmap-arraylist-values
 * @see Java Collections Framework - Oracle.
 *      https://docs.oracle.com/javase/tutorial/collections/
 * @see Data Structures for Search Applications - TutorialsPoint.
 *      https://www.tutorialspoint.com/java_data_structures/index.htm
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchEngine
{
	// this hashmap stores keywords as keys and lists of urls as values
	private HashMap<String, List<String>> index;

	// constructor for our search engine
	public SearchEngine()
	{
		// create a new empty hashmap when a search engine is made
		this.index = new HashMap<>();
	}

	/**
	 * Adds a URL to the list of results for a given keyword.
	 * If the keyword doesn't exist, a new list is created.
	 * @param keyword The search keyword.
	 * @param url The URL to add.
	 */
	public void add(String keyword, String url)
	{
		// if the keyword is not already in our index
		if (!index.containsKey(keyword))
		{
			// create a new empty list of urls for this keyword
			index.put(keyword, new ArrayList<>());
		}
		// add the url to the list associated with the keyword
		index.get(keyword).add(url);
	}

	/**
	 * Searches for URLs associated with a given keyword.
	 * @param keyword The search keyword.
	 * @return A new list of URLs for the keyword, or an empty list if not found.
	 */
	public List<String> search(String keyword)
	{
		// get the list of urls for the given keyword from our index
		List<String> results = index.get(keyword);

		// if no results are found
		if (results == null)
		{
			// return an empty list to avoid giving back null
			return new ArrayList<>();
		}
		// otherwise return a new copy of the results list
		// this prevents outside code from chaging our internal results
		return new ArrayList<>(results);
	}
}
