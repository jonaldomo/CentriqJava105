package wednesday;

import java.util.Arrays;

public class ArrayExercises {
	public static void main(String[] args) {
		String[] myStrings = new String[5];
		myStrings[0] = "John";
		myStrings[1] = "Nathan";
		System.out.println("myStrings.length = " + myStrings.length);
		System.out.println("myStrings.toString() = " + myStrings.toString());

		String[] myOtherStrings = { "John", "Nathan", null, null, null };
		System.out.println("myOtherStrings.toString() = " + myOtherStrings);

		System.out.println("Arrays.deepEquals(myStrings, myOtherStrings) = "
				+ Arrays.deepEquals(myStrings, myOtherStrings));
		System.out.println("Arrays.equals(myStrings, myOtherStrings)"
				+ Arrays.equals(myStrings, myOtherStrings));
		
		System.out.println(Arrays.toString(myStrings));
		System.out.println(Arrays.toString(myOtherStrings));
	}

}
