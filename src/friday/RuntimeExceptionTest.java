package friday;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		System.out.println("Getting ready to divide by 0");
		try {
			System.out.println(4/0);
		} catch (Exception e) {
			System.err.println("Fool! You can't " + e.getLocalizedMessage());
			System.err.println(e.toString());
		}
		System.out.println("Finished dividing by 0");
	}
}
