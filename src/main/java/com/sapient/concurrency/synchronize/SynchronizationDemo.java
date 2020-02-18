package com.sapient.concurrency.synchronize;

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();
		PrinterJob job1 = new PrinterJob(printer, 5);
		PrinterJob job2 = new PrinterJob(printer, 5);

		Thread t1 = new Thread(job1);
		Thread t2 = new Thread(job2);

		t1.setName(" Job-1 ");
		t2.setName(" Job-2 ");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("All jobs are completed....");

	}

}

class PrinterJob implements Runnable {

	private Printer printer;
	private int numberOfPages;

	public PrinterJob(Printer printer, int numberOfPages) {
		this.printer = printer;
		this.numberOfPages = numberOfPages;
	}

	@Override
	public void run() {
		printer.print(this.numberOfPages);

	}

}
