/**
 * This class contains three methods that check if the int value 4 is present in an array, how many times 4 shows up in an array,
 * and if four 4s show up in an array.
 */
public class AlteringArrays {

	/*
	 * This method declares the int array nums and secondNums and calls upon the checkFor4 method
	 * to confirm if the value 4 is present in the nums array. It then calls upon the checkFor4 method
	 * to see how many times the value 4 is present in secondNums. Lastly, it calls upon the checkForFour4 method
	 * to confirm if the value 4 is present in the secondNums array 4 times.
	 */
	public static void main(String[] args) 
	{
		int[] nums = {8, 3, -2, -5, 7, 4};
		System.out.println(checkFor4(nums));
		int[] secondNums = {4, 6, 4, 5, 4, 7, 4};
		System.out.println(countFor4(secondNums));
		System.out.println(checkForFour4(secondNums));
	}
	
	/*
	 * The checkFor4 method checks if the int value 4 is present in a given array and returns the boolean value true if present
	 * and false if it's not present. To do this, the boolean value of is4 is declared to track if the value 4 is present. Then,
	 * a for loop is made that checks each value in an array and changes the value of is4 to true if a 4 is identified in the array.
	 * After all numbers in an array are checked, then the final boolean value of is4.
	 */
	public static boolean checkFor4(int[] nums)
	{
		boolean is4 = false;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == 4)
			{
				is4 = true;
			}
		}
		return is4;
	}
	
	/*
	 * The countFor4 method tracks how many times the int value 4 shows up in a given array. To do this, the int variable fourCount
	 * is declared as a tracker for how many times 4 shows up. Then, a for loop checks each value in the array and adds a count to
	 * the fourCount variable whenever it detects the value of 4 in the array. After checking each number, it returns the final
	 * value of fourCount.
	 */
	public static int countFor4(int[] nums)
	{
		int fourCount = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == 4)
			{
				fourCount++;
			}
		}
		return fourCount;
	}
	
	/*
	 * The checkForFour4 method checks if the int value of 4 shows up in a given array exactly 4 times. To do this,
	 * an int variable fourCount is declared to track how many times the value of 4 is part of an array. Then, a for loop
	 * is created that checks each value in the array and adds 1 to the fourCount variable every time 4 is identified.
	 * Afterwards, an if statement checks if the final count of fourCount is 4, and returns the boolean value true if
	 * matched or false if the value of fourCount is less or greater than 4.
	 */
	public static boolean checkForFour4(int[] nums)
	{
		int fourCount = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == 4)
			{
				fourCount++;
			}
		}
		if (fourCount == 4)
		{
			return true;
		}
		return false;
	}
}
