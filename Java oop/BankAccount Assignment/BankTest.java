
public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(200.5, 300.5);
        bankAccount.deposit(200, 1);
        bankAccount.deposit(200, 2);
        bankAccount.withdraw(50, 1);
        bankAccount.withdraw(50, 2);
        System.out.println(bankAccount.toString());

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)

    }
}
