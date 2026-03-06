
/**
 * This class uses the selection sort algorithm to sort a given 2D array from left to right top to down and then
 * printing out the organized 2D array.
 */

public class TwoDeeSorter 
{
	
	/*
	 * The main method instantiates a double 2D Array and runs it through the sortVertHori method to sort and print out
	 * the array.
	 */

	public static void main(String[] args)
	{
		double[][] gridNum = {
				{22, 36, 8},
				{77, -2, 67},
				{90, 13, 59}
		};
		sortVertHori(gridNum);
	}
	
	/*
	 * The sortVertHori method uses the Selection Sort algorithm to sort a given 2D array and print out 
	 * the final product. To do this, the array becomes linear, tracking the locations in the 2D array
	 * as one dimensional array. Then, a nested for loop has the method traverse through the 2D array
	 * and uses an if statement to compare each value in the array and swaps the values when the smallest
	 * value is identified and loops until each value is in the right index.
	 */
	
	public static void sortVertHori(double[][] tempArr)
	{
		//These variables calculate and identify how many values there are in an array by
		//identifying how many values are there per row and column and then multiplying those amounts.
		
		int rows = tempArr.length;
		int cols = tempArr[0].length;
		int totalArr = rows * cols;
		
		//The for loop runs until the entire array is traversed. In this loop, the linear index i is converted
		//into 2D, identifying rows and columns through a formula and also instantiating the variables that will store the
		//index of the smallest value in the array.

		for (int i = 0; i < totalArr - 1; i++)
		{
			int currentRow = i / cols;
			int currentCol = i % cols;
			
			int minRow = currentRow;
			int minCol = currentCol;

			//This nested for loop uses the same formula for the currentRow and currentCol to convert the linear index j
			//to 2D. An if statement compares the two values and replaces the variables minRow and minCol with minLocRow
			// and minLocCol if the value at those variables are less than the value at minRow and minCol.
			
			for (int j = i + 1; j < totalArr; j++)
			{
				int minLocRow = j / cols;
				int minLocCol = j % cols;

				if (tempArr[minLocRow][minLocCol] < tempArr[minRow][minCol])
				{
					minRow = minLocRow;
					minCol = minLocCol;
				}
			}

			// These lines swap the lowest identified value in the array with the value in the current index.
			// After this, the for loop repeats this process for each value in the array so the 2D array is fully
			// sorted.
			
			double temp = tempArr[currentRow][currentCol];
			tempArr[currentRow][currentCol] = tempArr[minRow][minCol];
			tempArr[minRow][minCol] = temp;
		}
		
		//The following lines use a nested for loop to print out the result of sortVertHori, which is the sorted version
		//of a given array.
		
		for (int i = 0; i < tempArr.length; i++)
		{
			for (int j = 0; j < tempArr[0].length; j++)
			{
				System.out.print(tempArr[i][j] + ", ");
			}
			System.out.println("");
		}
	}
}
