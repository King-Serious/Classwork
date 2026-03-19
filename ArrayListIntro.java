
import java.util.ArrayList;

/**
 * This class practices the concept of Array Lists. This class adds, prints, removes, and changes values of an array list.
 */

public class ListIntro {

	public static void main(String[] args) 
	{
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		
		ArrayList<String> strArrList = new ArrayList<String>();
		
		// These following lines add values towards the previously instantiated array lists.
		
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		strArrList.add("Alice");
		strArrList.add("Bob");
		strArrList.add("Charlie");
		
		intArrList.add(2, 5);
		strArrList.add(1, "Derek");
		
		// These following lines add print out the second and last elements in the array lists.
		
		System.out.print(intArrList.get(1) + " ");
		System.out.println(intArrList.get(intArrList.size()-1));
		
		System.out.print(strArrList.get(1) + " ");
		System.out.println(strArrList.get(strArrList.size()-1));
		
		// These following lines change the first values of each array list to 0 and Zero and print out
		// the first values of the array before and after the change.
		
		System.out.print(intArrList.get(0) + " ");
		intArrList.set(0, 0);
		System.out.println(intArrList.get(0));
		System.out.print(strArrList.get(0) + " ");
		strArrList.set(0, "Zero");
		System.out.println(strArrList.get(0));
		
		// These last lines print out and remove the last value of the array lists.
		
		System.out.println(intArrList.remove(intArrList.size()-1));
		System.out.println(strArrList.remove(strArrList.size()-1));
		
	}

}
