/**
 * 
 */
package monday;

/**
 * @author Student
 * 
 */
public class PrintAlphabet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (char i = 'z'; i >= 'A'; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n------------------------");

		for (char c = 0; c <= 256; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println("\n------------------------");

		switch (2) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}

	}

}
