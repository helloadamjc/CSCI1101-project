package com.company;

public abstract class BankAccount {
    private String PIN;
    private static double balance;

    public BankAccount(){
    }

    public BankAccount(String P, double b){
        PIN = P;
        balance = b;
    }

    public abstract void registerTransaction(Transaction tran);


}
