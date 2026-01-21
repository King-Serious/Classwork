/**
 * This class contains two methods that replace all negative numbers in an array with 0 and changes the lowest number in an array to 0.
 */
public class AlteringArrays {

	/*
	 * This method declares the int array nums and newNums and calls upon the noNegatives method
	 * to replace all negatives from the nums array with 0 and the dropLowest method which traverses
	 * through the array to identify the lowest number and replace that with 0.
	 */
	public static void main(String[] args) 
	{
		int[] nums = {8, 3, -2, -5, 7};
		noNegatives(nums);
		System.out.println("");
		int[] newNums = {3, 4, -9, 2, 6, 7};
		dropLowest(newNums);
	}
	
	/*
	 * This method uses a for loop and if statement to check if each value in the given array is a negative or not. When the value is negative,
	 * that value is changed to the value of 0 and then printed out. Otherwise, the value is regularly printed.
	 */
	public static void noNegatives(int[] tempNums)
	{
		for (int i = 0; i < tempNums.length; i++)
		{
			if (tempNums[i] < 0)
			{
				tempNums[i] = 0;
			}
			System.out.print(tempNums[i] + ", ");
		}
		
		/*
		 * This method traverses a given array to identify the lowest number of the array and changing its value to 0.
		 * To do this, an int variable lowestNumber is declared that originally stores the value of the first value of the array.
		 * Then, a for loop and an if statement are used to check if the following number is lower than the value of lowestNumber.
		 * When it is, the value of lowestNumber is then assigned to that lower value and the cycle continues until all values are scanned.
		 * Afterwards, another for loop and if statement are used to print out the values of the array. When the lowestNumber is detected,
		 * instead of its value being placed, a 0 replaces it to mark it as the lowest number.
		 */
	}
	public static void dropLowest(int[] tempNums)
	{
		int lowestNumber = tempNums[0];
		for (int i = 1; i < tempNums.length; i++)
		{
			if (tempNums[i] < lowestNumber)
			{
				lowestNumber = tempNums[i];
			}
		}
		for (int j = 0; j < tempNums.length; j++)
		{
			if (tempNums[j] == lowestNumber)
			{
				System.out.print(0 + ", ");
			}
			else System.out.print(tempNums[j] + ", ");
		}
	}

}
