
/**
 * The TwoDeeArray class instantiates two 2D arrays and changes values in the arrays
 * and prints out their value after each change.
 */

public class TwoDeeArray {

	public static void main(String[] args) 
	{
		int[][] gridNums = new int[4][6];
		int[][] gridWithNums = {
				{4, 5, 7},
				{2, -1, 8},
				{0, 1, 3}
		};
		
		// The following lines change the first value of the first row in the array to 17, the third value in the
		// second row to 20, the last value of the first row to -5, the first value of the last row to -7,
		// and the last value in the last row to -30 and prints out the values.
		
		System.out.println(gridNums[0][0] + " " + gridWithNums[0][0]);
		gridNums[0][0] = 17;
		gridWithNums[0][0] = 17;
		System.out.println(gridNums[0][0] + " " + gridWithNums[0][0]);
		
		System.out.println(gridNums[1][2] + " " + gridWithNums[1][2]);
		gridNums[1][2] = 20;
		gridWithNums[1][2] = 20;
		System.out.println(gridNums[1][2] + " " + gridWithNums[1][2]);
		
		System.out.println(gridNums[0][gridNums[0].length-1] + " " + gridWithNums[0][gridWithNums[0].length-1]);
		gridNums[0][gridNums[0].length-1] = -5;
		gridWithNums[0][gridWithNums[0].length-1] = -5;
		System.out.println(gridNums[0][gridNums[0].length-1] + " " + gridWithNums[0][gridWithNums[0].length-1]);
		
		System.out.println(gridNums[gridNums.length-1][0] + " " + gridWithNums[gridWithNums.length-1][0]);
		gridNums[gridNums.length-1][0] = -7;
		gridWithNums[gridWithNums.length-1][0] = -7;
		System.out.println(gridNums[gridNums.length-1][0] + " " + gridWithNums[gridWithNums.length-1][0]);
		
		System.out.println(gridNums[gridNums.length-1][gridNums[0].length-1] + " " + gridWithNums[gridWithNums.length-1][gridWithNums[0].length-1]);
		gridNums[gridNums.length-1][gridNums[0].length-1] = -30;
		gridWithNums[gridWithNums.length-1][gridWithNums[0].length-1] = -30;
		System.out.println(gridNums[gridNums.length-1][gridNums[0].length-1] + " " + gridWithNums[gridWithNums.length-1][gridWithNums[0].length-1]);
		
		// These following lines call upon the printRow, printColumn, printRowMajor, and printColumnMajor to print the two arrays in certain orders.
		
		printRow(gridNums);
		printRow(gridWithNums);
		
		printColumn(gridNums);
		printColumn(gridWithNums);
		
		printRowMajor(gridNums);
		printRowMajor(gridWithNums);
		
		printColumnMajor(gridNums);
		printColumnMajor(gridWithNums);
	
	}
	
	/*
	 * The printRow method prints out each value from the first row of the given array.
	 * To do this, a for loop is created that'll print out the value in the first row of the array
	 * and keeps printing until all values in that row are printed.
	 */
	
	public static void printRow(int[][] tempArr)
	{
		for (int i = 0; i < tempArr[0].length; i++)
		{
			System.out.print(tempArr[0][i] + ", ");
		}
		System.out.println("");
	}
	
	/*
	 * The printColumn method prints out each value from the first column of the given array.
	 * To do this, a for loop is created that'll print out the value of the first column of the array
	 * and keeps printing until all values in that column are printed.
	 */
	
	public static void printColumn(int[][] tempArr)
	{
		for (int i = 0; i < tempArr.length; i++)
		{
			System.out.print(tempArr[i][0] + ", ");
		}
		System.out.println("");
	}
	
	/*
	 * The printRowMajor method prints out each value in an array in row-major order.
	 * To do this, a nested for loop is set that prints out each value in a row before
	 * moving to the next row and printing all the values in that row. This nested for loop keeps printing
	 * until the value of each row is printed out.
	 */
	
	public static void printRowMajor(int[][] tempArr)
	{
		for (int i = 0; i < tempArr.length; i++)
		{
			for (int j = 0; j < tempArr[i].length; j++)
			{
				System.out.print(tempArr[i][j] + ", ");
			}
			System.out.println("");
		}
	}
	
	/*
	 * The printColumnMajor prints out each value in an array in column-major order.
	 * To do this, a nested for loop is set that prints out each value in a column before
	 * moving to the next column and printing all values in that column. This nested for loop keeps printing until
	 * the value of each column is printed out.
	 */
	
	public static void printColumnMajor(int[][] tempArr)
	{
		for (int i = 0; i < tempArr[0].length; i++)
		{
			for (int j = 0; j < tempArr.length; j++)
			{
				System.out.print(tempArr[j][i] + ", ");
			}
			System.out.println("");
		}
	}
}
