/**
 * This class contains three methods that check if the int value 4 is present in an array, how many times 4 shows up in an array,
 * and if four 4s show up in an array.
 */
public class AlteringArrays {

	/*
	 * This method declares the int array nums and newNums and calls upon the noNegatives method
	 * to replace all negatives from the nums array with 0 and the dropLowest method which traverses
	 * through the array to identify the lowest number and replace that with 0.
	 */
	public static void main(String[] args) 
	{
		double[] nums = {8, 3, -2, -5, 7};
		for (int i = 0; i < nums.length; i++)
		{
		noNegatives(nums);
		System.out.println(nums[i]);	
		}
		System.out.println("");
		int[] newNums = {3, 4, -9, 2, 6, 7};
		for (int i = 0; i < nums.length; i++)
		{
			dropLowest(newNums);
			System.out.println(newNums[i]);
		}
	}
	
	/*
	 * This method uses a for loop and if statement to check if each value in the given array is a negative or not. When the value is negative,
	 * that value is changed to the value of 0 and then returned. Otherwise, the value is regularly returned.
	 */
	public static double[] noNegatives(double[] tempNums)
	{
		for (int i = 0; i < tempNums.length; i++)
		{
			if (tempNums[i] < 0)
			{
				tempNums[i] = 0;
			}
		}
		return tempNums;
		
		/*
		 * This method traverses a given array to identify the lowest number of the array and changing its value to 0.
		 * To do this, an int variable lowestNumber is declared that originally stores the value of the first value of the array.
		 * Then, a for loop and an if statement are used to check if the following number is lower than the value of lowestNumber.
		 * When it is, the value of lowestNumber is then assigned to that lower value and the cycle continues until all values are scanned.
		 * Afterwards, another for loop and if statement are used to print out the values of the array. When the lowestNumber is detected,
		 * instead of its value being placed, a 0 replaces it to mark it as the lowest number.
		 */
	}
	public static int[] dropLowest(int[] tempNums)
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
				tempNums[j] = 0;
			}
		}
		return tempNums;
	}

}
