/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccountdemo;

/**
 *
 * @author Flash Tech
 */
public class SavingsAccountDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount.setInterestRate(0.01);
        SavingsAccount mySavings = new SavingsAccount();
        SavingsAccount yourSavings = new SavingsAccount();
        System.out.println("I deposited $10.75.");
        mySavings.deposit(10.75);
        System.out.println("You deposited $75.");
        yourSavings.deposit(75.00);
        System.out.println("You deposited $55.");
        yourSavings.deposit(55.00);
        double cash = yourSavings.withdraw(15.75);
        System.out.println("You withdrew $" + cash + ".");
        if (yourSavings.getBalance() > 100.00) {
            System.out.println("You received interest.");
            yourSavings.addInterest();
        }
        System.out.println("Your savings is $"
                + yourSavings.getBalance());
        System.out.print("My savings is $");
        SavingsAccount.showBalance(mySavings);
        System.out.println();
        int count = SavingsAccount.getNumberOfAccounts();
        System.out.println("We opened " + count
                + " savings accounts today.");
    }
}


