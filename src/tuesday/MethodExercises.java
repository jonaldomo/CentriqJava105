package tuesday;

/**	Testing out static methods
 * 
 * @author Student
 *
 */
public class MethodExercises {
	public static void main(String[] args) {
		MethodExercises.noInputOutput();
		MethodExercises.stringInputNoOutput("input");
		String output = MethodExercises.noInputStringOutput();
		System.out.println(output);
		String output2 = MethodExercises.stringInputOutput("input");
		System.out.println(output2);
		String output3 = MethodExercises.twoInputs("input", "input");
		System.out.println(output3);
	}
	
	// has no inputs and no outputs
	public static void noInputOutput(){
		System.out.println("No inputs and no outputs");
		
	}
	
	// has a String input and no output
	public static void stringInputNoOutput(String input){
		System.out.println("A string input and no output");
	}	
	
	//has no input and a String output
	public static String noInputStringOutput(){
		System.out.println("no input and a string output");
		return "output";
	}
	
	// has a string input and a string output
	public static String stringInputOutput(String input){
		System.out.println("a string input and a string output");
		return "output";
	}
	
	// has two String inputs and a String output
	public static String twoInputs(String input1, String input2){
		System.out.println("two string inputs and a string output");
		return "output";
	}

}
