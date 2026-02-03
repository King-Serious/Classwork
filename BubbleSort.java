/**
 * This class creates a method that uses the bubble sort method to organize an array numerically from the smallest to greatest.
 */
public class AlteringArrays {

	/*
	 * This method declares the int array nums and calls upon the bubbleSort method to organize all values and place them in numerical order.
	 */
	public static void main(String[] args) 
	{
		int[] nums = {5, 0, 3, 20, 10};
		for (int i = 0; i < nums.length; i++)
		{
			bubbleSort(nums);
			System.out.println(nums[i]);
		}
	}
	
	/*
	 * This method analyzes each number in an array and checks if one number in an array is less than the number before it and switches it if true.
	 * This runs for the rest of the array until each number is compared and analyzed and then the final value tempNums is returned.
	 */
	public static int[] bubbleSort(int[] tempNums)
	{
		for (int i = 0; i < tempNums.length-1; i++)
		{
			int temp = tempNums[i];
			if (tempNums[i+1] < tempNums[i])
			{
				tempNums[i] = tempNums[i+1];
				tempNums[i+1] = temp;
			}
		}
		return tempNums;
	}

}
