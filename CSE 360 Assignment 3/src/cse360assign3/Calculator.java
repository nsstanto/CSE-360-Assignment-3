package cse360assign3;

/** 
 * Calculator is a class which generates an object to model a very simply calculator
 * through a few methods. It holds a total value which can be accessed and allows 
 * operations such as addition, subtraction, multiplication, division.
 * @author Nicholas Stanton
 * @version Feb 21, 2016 3:36PM
 */

public class Calculator 
{
	/** 
	 * The integer value of the results of operations done by the calculator.
	 */
	private int total;
	
	/** 
	 * The string that records what operations are done by the calculator. 
	 */
	private String history;
	
	/**
	 * Initializes total to 0.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * A get method for the calculator's current total. 
	 * @return total
	 * The integer value of the results of all operations done by calculator
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * A method for addition, adds a value to the total. Adds to history.
	 * @param value
	 * the value to be added.
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * A method for subtraction, subtracts a value from the total. Adds to history.
	 * @param value
	 * the value to be subtracted
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * A method for multiplication, multiplies the total by a value. Adds to history.
	 * @param value
	 * the value for the multiplication
	 */
	public void multiply (int value) 
	{
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * A method for division, divides the total by a value. If the value is 0, total
	 * is set to be 0. Adds to history whether value is 0 or not. 
	 * @param value
	 * the value for the division
	 */
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
		history += " / " + value;
	}
	
	/**
	 * A method that shows the operations that calculator has done. Includes all
	 * operations performed by the calculator. It is in the format of having 
	 * a space between every operator and every value.
	 * @return history
	 * a string variable that was added to every time add, subtract, multiply, or 
	 * divide is called.
	 */
	public String getHistory () 
	{
		return history;
	}
}
