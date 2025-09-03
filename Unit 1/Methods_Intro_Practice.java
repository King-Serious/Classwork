
public class TestExample {
/**
 * This class will create void methods regarding facts about me
 * as well as computing a few mathematical equations
 * Such as information regarding circles and two numbers
 * @param args
 */
	public static void main(String[] args) {
		  stateName();
		  System.out.println();
		  stateHairStyle();
		  System.out.println();
		  stateFavoriteFood();
		  System.out.println();
		  printCircleStats(4.2);
		  System.out.println();
		  printMathStuffs(2,5);
	/**
	 * The next 5 methods are programmed to print certain facts about me
	 * regarding my name, eye color, hair style, best friends, and favorite food
	 */
		  
	}
	public static void stateName() {
	System.out.print("Jesse Justo");
}

	public static void stateEyeColor() {
		System.out.print("Brown");
	}
	
	public static void stateHairStyle() {
		System.out.print("The Usual");
	}
	public static void stateBestFriend() {
		System.out.print("Everyone");
	}
	
	public static void stateFavoriteFood() {
		System.out.print("Steak and Mashed Potatoes");
	}
	/**
	 * This method will calculate the diameter, circumference, and area
	 * of a circle with a given radius in the main method
	 * And will print out the solutions
	 * This code should be adaptable to calculate with any radius
	 */
	public static void printCircleStats(double radius) {
		double diameter = radius * 2 ;
		double circumference = 2 * Math.PI * radius ;
		double area = Math.PI * (radius * radius) ;
		
		System.out.println("The radius of the circle is " + (radius));
		System.out.println("The diameter of the circle is " + (diameter));
		System.out.println("The circumference of the circle is " + (circumference));
		System.out.println("The area of the circle is " + (area));
	}
	/**
	 * This method will caclulate the sum, difference, product, quotient, and remainder
	 * of two numbers that are stated in the main method and is
	 * programmed to print out the results
	 */
	public static void printMathStuffs(int x, int y) {
		int sum = x + y ;
		int difference = y + x ;
		int product = x * y ;
		int quotient = x / y ;
		int remainder = x%y ;
		
		System.out.println("The sum of the two numbers is " + (sum));
		System.out.println("The difference of the two numbers is " + (difference));
		System.out.println("The product of the two numbers is " + (product));
		System.out.println("The quotient of the two numbers is " + (quotient));
		System.out.println("The remainder of the two numbers is " + (remainder));
		
	}
	}
