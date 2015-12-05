package threadingexample;

/**
 * When two or more threads need access to a shared resource, they need some way
 * to ensure that the resource will be used by only one thread at a time.
 * 
 * The process by which this synchronization is achieved is called thread
 * synchronization.
 * 
 * The synchronized keyword in Java creates a block of code referred to as a
 * critical section. Every Java object with a critical section of code gets a
 * lock associated with the object. To enter a critical section, a thread needs
 * to obtain the corresponding object's lock.
 * 
 * This is the general form of the synchronized statement:
 * 
 * synchronized(object) { // statements to be synchronized }
 * 
 * Here, object is a reference to the object being synchronized. A synchronized
 * block ensures that a call to a method that is a member of object occurs only
 * after the current thread has successfully entered object's monitor.
 */
public class SynchronisedThread {
	public static void main(String[] args) {
		Caller t = new Caller();
		Caller obj1 = new Caller(t, " First Object ");
		Caller obj2 = new Caller(t, " Second Object ");
		Caller obj3 = new Caller(t, " Third Object ");
		try {
			obj1.threadObj.join();
			obj2.threadObj.join();
			obj3.threadObj.join();
		} catch (Exception e) {
		}
	}
}

class Caller implements Runnable {
	Thread threadObj;
	String msg;
	Caller temp;

	public Caller() {
	}

	public Caller(Caller t, String msg) {
		this.msg = msg;
		temp = t;
		threadObj = new Thread(this);
		threadObj.start();
	}

	@Override
	public void run() {
		synchronized (temp) {
			temp.printMsg(msg);
		}
	}

	void printMsg(String msg) {
		System.out.print(" Message :: [" + msg);
		try {
	         Thread.sleep(1000);
	      } catch (InterruptedException e) {
	         System.out.println("Interrupted");
	      }
		System.out.println("]");
	}
}