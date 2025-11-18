/*
 * This method returns a month corresponding to the
 * entered integer
*/
public static String getMonth(int n)
	{{
		// This variable months contains the value of every month.
	
		String months = "January February March April May June " + "July August September October November December " ;

    		// This for loop goes through each number corresponding to a month and compares it
			// to the given number. When the number matches, the corresponding month is returned.

		for (int i = 1; i <= 12; i++)
		{
			// The variable sL refers to space Location and gets the index in months 
			
			int sL = months.indexOf(' ');

    		  	// This if statement only runs if the entered value n finally lines up with
				// the value of i, which aligns with whatever month it is.
			
			if (n == i)
			{
        		// When the conditions for the if statement runs,
				// the month aligned with the number will be returned
				
				return months.substring(0, sL);
			}
      			// Otherwise, the value of months increases to the next month
				// and the for loop runs again for each month
				
			else
			{
				
				months = months.substring(sL + 1);
			}
		}
		// At the end of this code, the string months is returned, which contains the month
		// that corresponds with the entered int

		return months;
		
	}}
