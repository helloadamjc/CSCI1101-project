package com.company;

public class SavingsAccount extends BankAccount {
    private String PIN;
    private static double balance;

    public SavingsAccount(String P, double b){
        super(P,b);
    }


    public void addMoney(Money m){
        balance += m.getAmount();
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
