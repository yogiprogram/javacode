package threadingexample;

class Q {
	int n;
	boolean isPut;

	synchronized void put(int value) {
		if (isPut) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(" Exception 1 :: While waiting the thread");
			}
		}
		isPut = true;
		n = value;
		System.out.println(" Put Value :: " + n);
		notify();
	}

	synchronized int get() {
		if (!isPut) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(" Exception :: While waiting the thread");
			}
		}
		isPut = false;
		notify();
		System.out.println(" Get Value :: " + n);
		return n;
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q2) {
		this.q = q2;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int value = 1;
		while (true) {
			q.put(value++);
		}
	}

}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q2) {
		this.q = q2;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while (true) {
			q.get();
		}
	}

}

public class MultiThreading {
	public static void main(String arg[]) {
		Q q = new Q();
		
		new Consumer(q);
		new Producer(q);
	}
}
