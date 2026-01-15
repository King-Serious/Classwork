/**
 * This class plays around with the concepts of arrays, declaring multiple arrays of each data type
 * As well as editing the values of the arrays and printing those values out.
 */
public class Arrays 
{

	public static void main(String[] args) 
	{
		// These lines declare new arrays of an int, double, boolean, string, and circle.
		double[] doubArr = {};
		int[] intArr = {};
		boolean[] booArr = {};
		String[] strArr = {};
		Circle[] cirArr = {};
		
		// This line declares a new int array that contains the values of multiple positive and negative ints.
		int[] contIntArr = {7, -12, 88, -88, 0, 5, 2000};
		
		// String = null
		// int = 0
		// double = 0.0
		// boolean = false
		// Circle = null
		String[] fruitsArr = new String[5];
		
		// This line edits the second value of fruitsArr and changes it to "Bapple".
		fruitsArr[1] = "Bapple";
		
		// This line edits the last value of fruitsArr and changes it to "Zanana". Instead of addressing the specific value as 4,
		// This line uses the .length command to identify how many values fruitsArr contains and subtracts it by one since
		// The count starts at 0.
		fruitsArr[fruitsArr.length-1] = "Zanana";
		
		// This line checks if the second value of fruitsArr was correctly changed to "Bapple" by printing out that value.
		System.out.println(fruitsArr[1]);
		
		// This for loop prints out every value of fruitsArr and runs until the value of i reaches the amount of how many
		// values are assigned to fruitsArr.
		for (int i = 0; i < fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}

	}

}
