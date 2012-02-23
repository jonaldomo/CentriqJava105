/**
 * 
 */
package monday;

/**
 * @author Student
 *
 */
public class PowersOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		long currentResult = 1;
		for(int power = 0; power <= 64; power++){
			currentResult = (long)Math.pow(2, power);
			System.out.println("2 ^ " + power + " = " + currentResult);
		}
		long stopTime = System.nanoTime();
		long executionTime = stopTime - startTime;
		System.out.println("Execution time was " + executionTime + ("ns"));
	}
	
	double calcTax(double rate, double item){
		char c = 0;
		return c;
	}

}
