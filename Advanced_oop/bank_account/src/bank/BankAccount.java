package bank;

import java.util.*;

public class BankAccount {

	private String accountNumber = "";
	private Double checking = 0.0;
	private Double savings = 0.0;
	private static int accountsCreated;
	
	
	public BankAccount() {
		this.accountNumber = newAccount();
		this.checking = 0.0;
		this.savings = 0.0;
		accountsCreated += 1;
		
		System.out.println("New bank user created with account number " + accountNumber + ".");
		System.out.println("Total accounts created: " + accountsCreated);
		
	}
	
	
	
	// Getters and Setters
	

	public Double getChecking() {
		return checking;
	}
	public void setChecking(Double checking) {
		this.checking = checking;
	}
	
	public Double getSavings() {
		return savings;
	}
	public void setSavings(Double savings) {
		this.savings = savings;
	}
	
	// Methods
	
	private String newAccount() {
		
		String number = "0123456789";
		String randAccount = "";
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			char num = number.charAt(rand.nextInt(10));
			randAccount += num;
		}
		
		accountNumber = randAccount;
		return randAccount;
		
	}
	
	public void accountDeposit(String type, Double depositAmount) {
		
		if(type == "checking") {
			setChecking(getChecking() + depositAmount);
		}
		else if (type == "savings") {
			setSavings(getSavings() + depositAmount);
		}
		else {
			System.out.println("Please choose your checking or savings account");
		}
	}
	
	public void accountWithdrawl(String type, Double withdrawlAmount) {
		if (type == "checking") {
			if (getChecking() < withdrawlAmount) {
				System.out.println("Not enough money... Sorry..");
			}
			else {
				setChecking(getChecking() - withdrawlAmount);
			}
		}
		else if (type == "savings") {
			if (getSavings() < withdrawlAmount) {
				System.out.println("Not enough money... Sorry..");
			}
			else {
				setSavings(getSavings() - withdrawlAmount);
			}
		}
	}
	
	public Double myBalance() {
		Double totalBalance = checking + savings;
		System.out.println(this.accountNumber + " Here is your combined balance: $" + totalBalance);
		return totalBalance;
	}
	
	
}
