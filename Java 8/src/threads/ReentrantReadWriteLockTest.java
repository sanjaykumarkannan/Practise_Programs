package threads;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest {
	
	private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	
	private ReentrantReadWriteLock.ReadLock readLock=lock.readLock();
	private ReentrantReadWriteLock.WriteLock writeLock=lock.writeLock();
	
	public static void main(String[] args) {
		
		ReentrantReadWriteLockTest obj=new ReentrantReadWriteLockTest();
		
		Thread t1=new Thread(() -> obj.readResource());
		Thread t2=new Thread(() -> obj.readResource());
		Thread t3=new Thread(() -> obj.writeResource());
		Thread t4=new Thread(() -> obj.writeResource());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	public void readResource() {
		readLock.lock();
		System.out.println("Read resource method!");
		readLock.unlock();
	}

	public void writeResource() {
		writeLock.lock();
		System.out.println("Write resource method");
		writeLock.unlock();
	}
}
