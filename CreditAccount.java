package com.company;

public class CreditAccount extends BankAccount {

    private String PIN;
    private double balance;

    public CreditAccount(String P, double b){
        super(P,b);
    }

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
}
