/**
 * 
 */
package monday;

/**
 * @author Student
 *
 */
public class FormatNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){			
			System.out.print(i + " ");
			if(i % 10 == 9){
				System.out.println();
			}			
		}
	}

}
