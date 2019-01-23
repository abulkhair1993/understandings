package com.reentrantlock;

public class Account {
	private int balance;
	private String name;
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	
	public boolean debit(Account fromAccount,int amount) {
		if(amount > balance) {
			System.out.println(fromAccount.getName()+" has Insufficient balance");
			return false;
		}
		balance = fromAccount.getBalance() - amount;
		fromAccount.setBalance(balance);
		System.out.println("Account Name "+fromAccount.getName() + "\tnew balance : "+fromAccount.getBalance());
		return true;
	}
	
	
	public void credit(Account toAccount,int amount) {
		balance += amount;
		toAccount.setBalance(balance);
		System.out.println("Account Name "+toAccount.getName() + "\tnew balance : " +toAccount.getBalance());
	}
}
