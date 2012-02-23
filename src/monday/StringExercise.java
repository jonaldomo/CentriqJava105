/**
 * 
 */
package monday;

/**
 * @author Student
 * 
 */
public class StringExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ourCook = "Chef Jacques Tartuffe";
		String isAChef = "Chef Boyardee";
		String food = "high priced French food";
		String goodFood = food;
		ourCook = isAChef;
		food = goodFood;
		System.out.println("Our " + food + " is made by " + ourCook);

		System.out.println("---------------------------");

		System.out.println('A');
		System.out.println('A' + 'B' + 'C');
		Character myChar = 'A';
		System.out.println(myChar.hashCode());
		Character bChar = 'B';
		System.out.println(bChar.hashCode());
		Character cChar = 'C';
		System.out.println(cChar.hashCode());
		System.out.println("The alphabet starts with " + 'A' + 'B' + 'C');
		System.out.println(0 + 1 + 2 + 3 + 4 + "OK" + 1 + 2 + 3 + 4);
	}

}
