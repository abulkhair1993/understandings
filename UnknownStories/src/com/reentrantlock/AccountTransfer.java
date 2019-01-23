package com.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class AccountTransfer {
	private ReentrantLock lock = new ReentrantLock();
	
	public void transfer(Account fromAccount,Account toAccount, int amount) {
		try {
			if(lock.tryLock()) {
				if(fromAccount.debit(fromAccount, amount)) {
					toAccount.credit(toAccount, amount);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			lock.unlock();
		}
	}

}
