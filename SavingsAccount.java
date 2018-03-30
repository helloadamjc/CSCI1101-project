package com.company;

import java.util.ArrayList;

public class SavingsAccount {

    private double balance;
    private ArrayList<Double> transactions = new ArrayList<>();




    public void transfer(BankAccount accW, BankAccount accD, double amt){

        Money mo = new Money("transfer", amt);
        //Money de = new Money("transfer", -amt);
        Transaction with = new Transaction(mo, "withdrawl");
        Transaction dep = new Transaction(mo, "deposit");

        accW.registerTransaction(with);
        accD.registerTransaction(dep);
    }

    public void registerTransaction(Transaction tran){

        if(tran.getForm().equals("withdrawl")){
            balance-= tran.getMoney().getAmount();
        }
        else{
            balance+= tran.getMoney().getAmount();
        }

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
