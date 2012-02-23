/**
 * 
 */
package monday;

import java.io.IOException;

/**
 * @author Student
 *
 */
public class ReverseExercise {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String line = "";
		char c = 0;
		do{
			c = (char)System.in.read();
			line = c + line;
		} while (c != '\n');
		
		System.out.println(line);
		
		

	}

}
