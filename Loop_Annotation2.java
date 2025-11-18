	/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   	 * the following question: what does this method do?
	 * This method isn't static, meaning that it is able to call on different objects
	 * within this class.
	 * This method will return a value if a string contains a given char c
	 * and that value will identify which character in that string contains that letter.
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * 
		 * The variable str must've been instantiated somewhere else within the class.
		 * Since this method is nonstatic, it is able to call on other objects within this class
		 * which means it's safe to assume that str is a different objects from this class that was
		 * previously instantiated.
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * The loop below might result in a syntax error if the value of str is just ""
		 * Which results in the console saying that the string index is out of range.
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * This line is checking if a character in position i in str is equivalent to 
			 * the char c and returns that position number (aka i) when they match (aka when the code is true)
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * The purpose of this line is to inform the user that at no point in the str
		 * does char c show up.
		 */
		return -1;
		
	}
