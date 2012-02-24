package friday;

public class CheckedExceptionTest {
	public static void main(String[] args) {
		System.out.println("Going to sleep!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Awake!");
	}
}
