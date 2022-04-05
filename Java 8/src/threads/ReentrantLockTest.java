package threads;

import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
	
	private static ReentrantLock lock=new ReentrantLock();
	public static void main(String[] args) {
		//ReentrantLockTest obj=new ReentrantLockTest();
		try {
		Thread t1=new Thread(() -> printHello());
		Thread t2=new Thread(() -> printHello());
		Thread t3=new Thread(() -> printHello());
		Thread t4=new Thread(() -> printHello());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void printHello()  {
		//if (lock.tryLock()) {
			lock.lock();
			System.out.println("Hello");
			sayHi();
		//}
	}
	
	private static void sayHi() {
		try {
		System.out.println("Hiiii");}
		finally {
			lock.unlock();
		}
	}

}
