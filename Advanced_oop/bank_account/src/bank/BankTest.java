package bank;

public class BankTest {
	
	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount();
		BankAccount user2 = new BankAccount();

		
		user1.accountDeposit("checking", 100.25);
		user1.accountDeposit("savings", 345.45);
		user1.accountWithdrawl("checking", 25.70);
		user1.myBalance();
		
		user2.accountDeposit("checking", 700.00);
		user2.accountDeposit("savings", 345.45);
		user2.accountWithdrawl("savings", 45.45);
		user2.myBalance();
		
		
	
	}
	
	
	
}
