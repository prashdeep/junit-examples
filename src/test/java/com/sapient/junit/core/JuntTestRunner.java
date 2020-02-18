package com.sapient.junit.core;

import java.util.Iterator;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JuntTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(BaseTest.class);
		
		List<Failure> failures = result.getFailures();
		
		Iterator<Failure> it = failures.iterator();
		while(it.hasNext()) {
			Failure failure = it.next();
			System.out.println(failure.getMessage());
		}
	}
}
