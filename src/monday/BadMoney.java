/**
 * 
 */
package monday;

/**
 * @author Student
 *
 */
public class BadMoney {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double dollar = 1.00;
		double dime = dollar / 10.00;
		double total = 0.0;
		
		for(int i = 0; i<10; i++){
			total = total + dime;
		}
		
		System.out.println(total);
		System.out.println(Math.round(total));

	}

}
