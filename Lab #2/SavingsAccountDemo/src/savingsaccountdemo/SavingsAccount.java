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
public class SavingsAccount {

    private double balance;
    public static double interestRate = 0;
    public static int numberOfAccounts = 0;

    public SavingsAccount() {
        balance = 0;
        numberOfAccounts++;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            amount = 0;
        }
        return amount;
    }

    public void addInterest() {
        double interest = balance * interestRate;
// you can replace interestRate with getInterestRate()
        balance = balance + interest;
    }

    public double getBalance() {
        return balance;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.print(account.getBalance());
    }
}
