
public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int accounts;
	private static double totalMoney;

	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		accounts++;
		totalMoney += checkingBalance + savingsBalance;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static void setAccounts(int accounts) {
		BankAccount.accounts = accounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}

	public void deposit(double amount, int balance) {
		if (balance == 1) {
			checkingBalance += amount;
		} else if (balance == 2) {
			savingsBalance += amount;
		} else {
			System.out.println("no number");
		}
	}

	public void withdraw(double withdrawAmount, int balance) {
		if (withdrawAmount < 0.0) {
			System.out.println("no money in your Account");
		} else if (balance == 1) {
			checkingBalance -= withdrawAmount;
			totalMoney -= withdrawAmount;
		} else if (balance == 2) {
			savingsBalance -= withdrawAmount;
			totalMoney -= withdrawAmount;
		}
	}

	@Override
	public String toString() {
		return "BankAccount [checkingBalance=" + checkingBalance + ", savingsBalance=" + savingsBalance
				+ ", depositChecking" + getCheckingBalance() + ", depositSavings=" + getSavingsBalance()
				+ "]";
	}
}
