
public class TestExample {
/**
 * This class will combine void and nonvoid methods to print info regarding facts about me
 * as well as computing a few mathematical equations
 * Such as information regarding circles and two numbers
 * @param args
 */
	public static void main(String[] args) {
		  System.out.println(giveName());
		  System.out.println(giveEyeColor());
		  System.out.println(giveHairStyle());
		  System.out.println(giveBestFriend());
		  System.out.println(giveFavoriteFood());
		  System.out.println(getCircleStats(4.2));
		  System.out.println("The sum is " + getSum(2,5));
		  System.out.println("The difference is " + getDifference(2,5));
		  System.out.println("The product is " + getProduct(2,5));
		  System.out.println("The quotient is " + getQuotient(2,5));
		  System.out.println("The remainder is " + getRemainder(2,5));
	/**
	 * The next 5 methods are programmed to return info regarding certain facts about me,
	 * specifically my name, eye color, hair style, best friends, and favorite food,
	 * to the main method
	 */
		  
	}
	public static String giveName() {
	return "Jesse Justo";
}

	public static String giveEyeColor() {
		return "Brown";
	}
	
	public static String giveHairStyle() {
		return "The Usual";
	}
	public static String giveBestFriend() {
		return "Everyone";
	}
	
	public static String giveFavoriteFood() {
		return "Steak and Mashed Potatoes";
	}
	/**
	 * This method will calculate the diameter, circumference, and area
	 * of a circle with a given radius in the main method
	 * And will return the solutions to the main method
	 * This code should be adaptable to calculate with any radius
	 */
	public static String getCircleStats(double radius) {
		double diameter = radius * 2 ;
		double circumference = 2 * Math.PI * radius ;
		double area = Math.PI * (radius * radius) ;
		
		return "The radius of the circle is " + (radius) + ". The diameter of the circle is " + (diameter) + ". The circumderence of te circle is " + (circumference) + ". The area of the circle is " + (area);
	}
	/**
	 * The next 5 methods will caclulate the sum, difference, product, quotient, and remainder
	 * of two numbers that are stated in the main method and is
	 * programmed to return the results to the main method
	 */
	public static int getSum(int x, int y) {
		
		return (x + y);
		
	}
	public static int getDifference(int x, int y) {
		
		return (x - y);
	}
	
	public static int getProduct(int x, int y) {

		return (x * y);
	}
	
	public static int getQuotient(int x, int y) {

		return (x / y);
	}
	
	public static int getRemainder(int x, int y) {
		
		return (x%y);
	}
	}
