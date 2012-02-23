package thursday.concurrency;

public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello from a thread!");		
	}
	
	public static void main(String[] args) {
		HelloRunnable myHelloRunnable = new HelloRunnable();
		Thread myThread = new Thread(myHelloRunnable);
		myThread.start();
	}

}
