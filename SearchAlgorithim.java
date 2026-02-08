/**
 * This class creates a method that uses the binary sort method to identify the index where a value can be found in an array.
 */
public class AlteringArrays {

	/*
	 * This method declares the int array nums and int variable target and calls upon the biSort method to identify the index
	 * where the value of target can be found in array nums.
	 */
	public static void main(String[] args) 
	{
		int[] nums = {3, 5, 6, 8, 12, 16, 18};
		int target = 18;
		System.out.println(biSort(nums, target));
	}
	
	/*
	 * This method searches for a target int by creating variables that track the minimum, maximuum, and middle point of an array and 
	 * continuously cutting the range in half by checking the midpoint of a given range and checking if it's 
	 * higher, lower, or equal to the target int. If it's greater than the target, then the max is changed to the value of the midpoints
	 * and the midpoint is changed to half the max value. Otherwise, if the value at the midpoint is less than the target, 
	 * then the min is adjusted to the midpoint and the new midpoint is changed to the minimum plus the difference betweeen
	 * the maximum plus and minimum divided by 2. Once the value at mid in nums array is equivalent to the target value,
	 * mid is returned.
	 */
	public static int biSort(int[] tempNums, int target)
	{
		int min = 0;
		int max = tempNums.length -1;
		int mid = min + (max-min)/2;
		while (tempNums[mid] != target)
		{
			mid = min + (max-min)/2;
			if (tempNums[mid] > target)
			{
				max = mid;
				mid = max/2;
			}
			else if (tempNums[mid] < target)
			{
				min = mid;
				mid = min + (max-min)/2;
				if (tempNums[mid+1] == target)
				{
					mid = mid +1;
				}
			}
		}
		return mid;
	}

}
