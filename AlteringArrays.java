/**
 * This class creates a method that subtracts all 4 values of an array by 5 and prints out the new values.
 */
public class AlteringArrays {

	/*
	 * This method declares the int array nums and calls upon the subtract5FromAll4 method to subtract all values in the arrays by 5.
	 */
	public static void main(String[] args) 
	{
		int[] nums = {5, 0, 8, 20};
		for (int i = 0; i < nums.length; i++)
		{
			subtract5FromAll4(nums);
			System.out.println(nums[i]);
		}
	}
	
	/*
	 * This method creates a copy of the nums array with each value and subtracts all of the values of that copy by 5. Then,
	 * the code returns each new value of the array.
	 */
	public static int[] subtract5FromAll4(int[] tempNums)
	{
		for (int i = 0; i < tempNums.length; i++)
		{
			tempNums[i] = tempNums[i] - 5;
		}
		return tempNums;
	}

}
