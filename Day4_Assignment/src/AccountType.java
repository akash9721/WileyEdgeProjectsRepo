
public enum AccountType {
	CURRENT(1000), SAVING(500);

	int openingBal;

	private AccountType(int openingBal) {
		this.openingBal = openingBal;
	}

	public int getBalance() {

		return openingBal;
	}

}
