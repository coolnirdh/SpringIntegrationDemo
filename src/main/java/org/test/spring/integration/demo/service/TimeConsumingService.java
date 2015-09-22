package org.test.spring.integration.demo.service;

/**
 * Created by Nirdh on 22-09-2015.
 */
public class TimeConsumingService {

	public String operationLastingThreeSeconds(String input) throws InterruptedException {
		System.out.println("Stage1 - Starting operation on: " + input);
		Thread.sleep(3000);
		//System.out.println("Stage1 - Operation completed on: " + input);
		return input;
	}

	public String operationLastingFiveSeconds(String input) throws InterruptedException {
		System.out.println("Stage2 - Starting operation on: " + input);
		Thread.sleep(5000);
		//System.out.println("Stage2 - Operation completed on: " + input);
		return input;
	}
}
