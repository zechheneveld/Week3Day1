package com.company;

public class BankAccount {

    public int accNumber;
    public String accHolderName;
    public double balance;


    //public BankAccount(int accNumber, String accHolderName, double balance){
        // hot key to enter all this is "comand n" and select constructor and highlight all three

    public BankAccount(int accNumber, String accHolderName, double balance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public void withdraw(double value){
        this.balance -= value;

    }

    public void deposit(double value){
        this.balance += value;

    }
}
