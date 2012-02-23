/**
 * 
 */
package monday;

/**
 * @author Student
 * 
 */
public class MathExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(1 / 1);
		System.out.println(1 / 2);
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("fail");
		}
		System.out.println(2 / 3);
		System.out.println(2 / 3.0);

		System.out.println("---------------------");
		int x = 0;
		System.out.println(x++);
		System.out.println(++x);
		
		System.out.println("---------------------");
		System.out.println(5 % 3);
		System.out.println(5 % 4);
		System.out.println(5 % 9);
		
		System.out.println("---------------------");
		int myInt = 128;
		byte myByte;
		myByte = (byte)myInt;
		System.out.println(myByte);
	}

}
