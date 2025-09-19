
public class ShapesMain {
/**
 * This class works with the Circle class to print the
 * radius, circumference, area, and degrees of given circles
 * @param args
 */
	public static void main(String[] args) {
		//These following codes declares the values of two circles
		Circle myCirc1 = new Circle(3.0);
		Circle myCirc2 = new Circle(6.7);
		//These following codes print out the values of the two circles
		System.out.println(myCirc1);
		System.out.println(myCirc2);
		//These following codes declare and print out the value of a third cirlce
		Circle myCirc3 = myCirc1;
		System.out.println(myCirc3);
		/*
		 * Call constructor to generate a new
		 * Circle object w/ radius, circumference, area, and degrees
		 * Also stating shapes
		 */
		System.out.println(myCirc1.getRadius());
		myCirc1.setRadius(6.8);
		System.out.println(myCirc1.getRadius());
		System.out.println(myCirc1.getCircumf());
		System.out.println(myCirc1.getArea());
		System.out.println(Circle.getDegrees());
		Circle.stateShape();

	}

}
