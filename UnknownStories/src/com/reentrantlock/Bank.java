package com.reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author abulshai
 *
 */
/****************************************** OUTPUT ************************/
/*
 * Account Name Mark new balance : 800 Account Name Abul new balance : 1200
 * Account Name Mark new balance : 600 Account Name Abul new balance : 1400
 * Account Name Mark new balance : 400 Account Name Abul new balance : 1600
 * Account Name Mark new balance : 200 Account Name Abul new balance : 1800
 */

public class Bank {
	public static void main(String args[]) {

		ExecutorService exeService = Executors.newFixedThreadPool(2);
		Account abul = new Account();
		abul.setBalance(1000);
		abul.setName("Abul");
		Account mark = new Account();
		mark.setBalance(1000);
		mark.setName("Mark");

		// Job 1
		Runnable t1 = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Thread one error");
				}
				AccountTransfer accountTransfer = new AccountTransfer();
				accountTransfer.transfer(mark, abul, 200);
			}
		};

		// Job 2
		Runnable t2 = new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("Thread one error");
				}
				AccountTransfer accountTransfer = new AccountTransfer();
				accountTransfer.transfer(mark, abul, 200);
			}
		};

		for (int i = 0; i < 2; i++) {
			exeService.execute(t1);
			exeService.execute(t2);
		}
	}

}
