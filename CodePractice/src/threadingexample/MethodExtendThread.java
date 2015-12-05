package threadingexample;

/**
 * Create Thread by Extending Thread:
 * 
 * The second way to create a thread is to create a new class that extends
 * Thread, and then to create an instance of that class.
 * 
 * The extending class must override the run( ) method, which is the entry point
 * for the new thread. It must also call start( ) to begin execution of the new
 * thread.
 * 
 */
public class MethodExtendThread extends Thread {

	public MethodExtendThread() {
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start();
	}

	public void run() {
		try {
			for (int cunt = 5; cunt > 0; cunt--) {
				System.out.println("Child Thread: " + cunt);
				// Let the thread sleep for a while.
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.err.println(" Exception : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println(" ************* Main Start ***************");
		new MethodImplementRunnable();
		try {
			for (int cunt = 5; cunt > 0; cunt--) {
				System.out.println("Main Thread : " + cunt);
				// Let the thread sleep for a while.
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.err.println(" Exception : " + e.getMessage());
		}
		System.out.println(" ************* Main Exit ***************");
	}
}
