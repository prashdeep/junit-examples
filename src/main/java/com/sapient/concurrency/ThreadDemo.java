package com.sapient.concurrency;

public class ThreadDemo{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		//Thread.sleep(5000);
		Thread t1 = new Thread(() -> {
			
				for(int index = 0; index < 10; index ++) {
					System.out.println("THread name "+ index);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		});
		Thread t2 = new Thread(new Task2());
		t1.start();
		
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("SHould be printed after 5 second");
	}
}

class Task1 implements Runnable {
	public void run() {
		for(int index = 0; index < 10; index ++) {
			System.out.println("THread name "+ index);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task2 implements Runnable {
	public void run() {
		for(int index = 0; index < 10; index ++) {
			System.out.println("THread name "+ index);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
