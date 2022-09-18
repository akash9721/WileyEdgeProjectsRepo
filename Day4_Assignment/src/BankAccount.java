
public class BankAccount {

	private int accountId;
	private String accountHolderNmae;
	private double openingBalance;
	private double currentBalance;
	private double indivisualBalance;
	private static double totalBalance;

	public BankAccount(int accountId, String accountHolderNmae, int openingBalance) {
		this.accountId = accountId;
		this.accountHolderNmae = accountHolderNmae;
		this.openingBalance = openingBalance;
		this.indivisualBalance += this.currentBalance + this.openingBalance;
		totalBalance += this.openingBalance;
	}

	public void displayTotalBalance() {
		System.out.println("the total balance in the bank is: " + totalBalance);

	}

	public void depositAmount(double currentBalance) {
		if (currentBalance < 0) {
			System.out.println("Invalid Amount");
			System.out.println("----------------------------------------------");
			return;
		}
		this.currentBalance += currentBalance;
		System.out.println("Thanks for deposit: " + currentBalance);
		this.indivisualBalance += currentBalance;
		System.out.println("your current balance is: " + indivisualBalance);
		totalBalance += currentBalance;
		displayTotalBalance();
		System.out.println("----------------------------------------------");

	}

	public void withdrawAmount(double currentBalance) {
		if (currentBalance > totalBalance || currentBalance > indivisualBalance) {
			System.out.println("You should not be able to withdraw the amount more than yourcurrent and total balance");
			System.out.println("----------------------------------------------");
			return;
		}
		this.currentBalance -= currentBalance;
		System.out.println("Thanks for withdraw: " + currentBalance);
		this.indivisualBalance -= currentBalance;
		System.out.println("your current balance is: " + indivisualBalance);
		totalBalance -= currentBalance;
		displayTotalBalance();
		System.out.println("----------------------------------------------");

	}

}
