package com.sapient.concurrency.synchronize;

public class Printer {
	
	public synchronized void print(int numberOfPages) {
		for(int index = 0; index < numberOfPages; index++) {
			System.out.printf("Printing %d page out of %d  for job %s %n", index, numberOfPages, Thread.currentThread().getName() );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
