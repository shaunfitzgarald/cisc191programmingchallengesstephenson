package edu.sdmesa.cisc191;
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
 * GeeksforGeeks. (n.d.). Tree Traversals (Inorder, Preorder and Postorder). GeeksforGeeks.
 * Retrieved from https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 * 
 * GeeksforGeeks. (n.d.). Binary Search Tree. GeeksforGeeks.
 * Retrieved from https://www.geeksforgeeks.org/binary-search-tree-data-structure/
 * 
 * Cornell University. (n.d.). Developing a Recursive Method. CS Department, Cornell University.
 * Retrieved from https://www.cs.cornell.edu/courses/JavaAndDS/files/recursionDev.pdf
 * 
 * Wikipedia contributors. (n.d.). Tree traversal. Wikipedia, The Free Encyclopedia.
 * Retrieved from https://en.wikipedia.org/wiki/Tree_traversal
 * 
 * 
 * Version/date: 1.0/11-17-2025
 * 
 * Responsibilities of class:
 * This class is responsible for storing a name and its left and right nodes.
 */
public class NameNode
{
	// A NameNode has-a left node
	private NameNode left;
	
	// A NameNode has-a name
	private String name;
	
	// A NameNode has-a right node
	private NameNode right;
	

	/**
	 * 
	 * @param newName the String stored in the node
	 */
	public NameNode(String newName)
	{
		// Store newName in node
		this.name = newName;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * 
	 * @return the String stored in the node
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the left node of this node
	 * @param newLeft
	 */
	public void setLeft(NameNode newLeft)
	{
		this.left = newLeft;
	}
	
	/**
	 * Set the right node of this node
	 * @param newRight
	 */
	public void setRight(NameNode newRight)
	{
		this.right = newRight;
	}
	
	/**
	 * 
	 * @return the left node of this node
	 */
	public NameNode getLeft()
	{
		return left;
	}
	
	/**
	 * 
	 * @return the right node of this node
	 */
	public NameNode getRight()
	{
		return right;
	}
	
	/**
	 * Find the least name in the tree
	 * @return the first name of the names in the tree in lexicographical order
	 */
	public String getFirstName()
	{
		// The first name is the leftmost node (smallest in alphabetical order)
		if (left == null)
		{
			return name;
		}
		else
		{
			return left.getFirstName();
		}
	}
	
	/**
	 * Find the largest name in the tree
	 * @return the last name of the names in the tree in lexicographical order
	 */
	public String getLastName()
	{
		// The last name is the rightmost node (largest in alphabetical order)
		if (right == null)
		{
			return name;
		}
		else
		{
			return right.getLastName();
		}
	}

	/**
	 * Insert a new name into a tree
	 * 
	 * @param newName the name to be inserted
	 */
	public void insert(String newName)
	{
		// See
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)

		if (newName.compareTo(name) < 0)
		{
			// Insert newName on the left (comes before current name alphabetically)
			if (left == null)
			{
				left = new NameNode(newName);
			}
			else
			{
				left.insert(newName);
			}
		}
		else if (newName.compareTo(name) > 0)
		{
			// Insert newName on the right (comes after current name alphabetically)
			if (right == null)
			{
				right = new NameNode(newName);
			}
			else
			{
				right.insert(newName);
			}
		}
		// else: if newName equals name, do nothing (duplicate)

	}

	/**
	 * @return the names in the tree in lexicographical order
	 */
	public String toString()
	{
		String returnValue = "";

		// In-order traverse tree recursively:
		// traverse and add left subtree, then add this, then traverse and add right subtree
		if (left != null)
		{
			returnValue += left.toString();
		}
		returnValue += name;
		if (right != null)
		{
			returnValue += right.toString();
		}

		return returnValue;
	}

}
