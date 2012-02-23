/**
 * 
 */
package monday;

/**
 * @author Student
 * 
 */
public class IOExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			char c = (char)System.in.read();
			System.out.println(c);
		} catch (Exception e) {
			
		}
		
		System.err.println("error");

	}

}
