package org.example.Bank;

public class BankAccount {
    private String accountNumber;
    private double amount;

    public BankAccount(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double balance){
        amount += balance;
    }
    public void withdraw(double balance){
        if(balance <= amount){
            amount += balance;
        }else{
            System.out.println("insufficient funds....");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
