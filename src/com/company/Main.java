package com.company;

public class Main {

    public static void main(String[] args) {
	//Weekend Challenge 2: Building bank accounts

        BankAccount scottsAccount = new BankAccount(38292, "Scott", 0.00);
        BankAccount koddiesAccount = new BankAccount(94011, "Koddie", 0.00);
        BankAccount marksAccount = new BankAccount(94832, "Mark", 0.00);
        BankAccount mannysAccount = new BankAccount(94820, "Manny", 0.00);

        //Array loop
        BankAccount[] listofAccounts = {scottsAccount, koddiesAccount, marksAccount, mannysAccount};

        //System.out.println(listofAccounts[0].balance); This will only display scotts balance

        for (int i = 0; i < listofAccounts.length; i++) {
            listofAccounts[i].deposit(57000);
            System.out.println(listofAccounts[i].accHolderName + " " + listofAccounts[i].balance);

        }
        //new loop (foreach loop)!!! Cannot pinpoint just one account with this loop :(
        for (BankAccount specificAccount : listofAccounts){
            System.out.println(specificAccount.accHolderName);
            specificAccount.deposit(500);
            System.out.println(specificAccount.balance);
        }



        System.out.println("Withdraw from Scott 4000");
        listofAccounts[0].withdraw(4000);
        System.out.println("Scotts account: " + listofAccounts[0].balance);

    }
}
