package com.company;
import java.util.ArrayList;
public class ChequingAccount {

    private double balance =0;
    private ArrayList<Double> transactions = new ArrayList<>();

    public void transfer(BankAccount accW, BankAccount accD, double amt){

        Money mo = new Money("transfer", amt);
        //Money de = new Money("transfer", -amt);
        Transaction with = new Transaction(mo, "withdrawl");
        Transaction dep = new Transaction(mo, "deposit");

        accW.registerTransaction(with);
        accD.registerTransaction(dep);
    }

    public double getBalance(){
        return balance;
    }

    public void changeBalance(Double n){
        balance += n;
        transactions.add(n);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void registerTransaction(Transaction tran){
        if(tran.getForm().equals("withdrawl")){
            balance-= tran.getMoney().getAmount();
        }
        else{
            balance+= tran.getMoney().getAmount();
        }

    }


    public String toString() {
        return "Balance: " + balance;
    }
}
