package com.company;

import java.util.ArrayList;

public class CreditAccount {

    private double balance=0;
    private ArrayList<Double> transactions = new ArrayList<>();



    public double getBalance(){
        return balance;
    }

    public void changeBalance(double d){
        balance += d;
        transactions.add(d);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }



    public String toString(){
        return "Balance: " + balance;
    }
}
