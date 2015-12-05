package threadingexample;

/**
 * Create Thread by Implementing Runnable:
 * 
 * The easiest way to create a thread is to create a class that implements the
 * Runnable interface.
 * 
 * To implement Runnable, a class need only implement a single method called
 * run( ), which is declared like this:
 * 
 * public void run( )
 * 
 * You will define the code that constitutes the new thread inside run() method.
 * It is important to understand that run() can call other methods, use other
 * classes, and declare variables, just like the main thread can.
 * 
 * After you create a class that implements Runnable, you will instantiate an
 * object of type Thread from within that class. Thread defines several
 * constructors. The one that we will use is shown here:
 * 
 * Thread(Runnable threadOb, String threadName);
 * 
 * Here threadOb is an instance of a class that implements the Runnable
 * interface and the name of the new thread is specified by threadName.
 * 
 * After the new thread is created, it will not start running until you call its
 * start( ) method, which is declared within Thread. The start( ) method is
 * shown here:
 * 
 * void start( );
 */
public class MethodImplementRunnable implements Runnable {

	public MethodImplementRunnable() {
		Thread thread = new Thread(this, "Child");
		thread.start();
	}

	@Override
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
