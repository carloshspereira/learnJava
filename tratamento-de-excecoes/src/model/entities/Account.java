package model.entities;

import model.excepitions.DomainExceptions;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public Account() {

	}

	public Account(int number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getWithDrawLimit() {
		return withdrawLimit;
	}

	public void setWithDrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new DomainExceptions("Not enough balance");
		}
		if (amount > withdrawLimit) {
			throw new DomainExceptions("The amount exceeds withdraw limit");
		}
		balance -= amount;
	}
}
