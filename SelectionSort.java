
/**
 * The SelectionSort class uses the Selection Sort algorithm to organize a given array and return it in numerical order.
 */

public class SelectionSort {

	/*
	 * The main method declares an int array nums and runs the nums array through the select method and uses a for loop
	 * to print out the final values of the array once completed.
	 */
	
	public static void main(String[] args) 
	{
		int[] nums = {5, 9, 3, 1, 2, 7, 8};
		select(nums);
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + ", ");
		}
	}
	
	/*
	 * The select method uses selection sort to organize a given int array and place it in numerical order.
	 * This method has a nested for loop that runs until it reaches the maximum length of the array.
	 * While this loop runs, the int variable minLoc is set to the value of i to identify the location of the
	 * minimum. If the value of the minimum is greater than the value at j, the variable minLoc is assigned to
	 * j, the location of the smaller number. Once the final minLoc is located, a temporary int variable stores
	 * the smallest found value and swaps the value at the location of the smallest number with the value at i.
	 * Once this is done, the array is returned.
	 */
	
	public static int[] select(int[] tempNums)
	{
		for (int i = 0; i < tempNums.length-1; i++)
		{
			int minLoc = i;
			for (int j = i + 1; j < tempNums.length; j++)
			{
				if (tempNums[minLoc] > tempNums[j])
				{
					minLoc = j;
				}
			}
			int temp = tempNums[minLoc];
			tempNums[minLoc] = tempNums[i];
			tempNums[i] = temp;
		}
		return tempNums;
	}

}
