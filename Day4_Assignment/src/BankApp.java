
public class BankApp {
	public static void main(String[] args) {
		AccountType at = AccountType.CURRENT;
		AccountType at2 = AccountType.SAVING;
		BankAccount b1 = new BankAccount(123, "akash", at.getBalance());
		BankAccount b2 = new BankAccount(554, "kumar", at.getBalance());
		BankAccount b3 = new BankAccount(234, "prabh", at.getBalance());
		b1.displayTotalBalance();
//		b1.depositAmount(1000);
		b1.depositAmount(2000);
		b1.depositAmount(3000);
		b2.depositAmount(1000);
		b3.depositAmount(2000);
		b1.depositAmount(1000);
		b1.withdrawAmount(7000);

	}

}
