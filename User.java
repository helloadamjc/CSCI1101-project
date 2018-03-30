package com.company;

public class User {
    private ChequingAccount chequings;
    private CreditAccount credit;
    private SavingsAccount savings;
    private String pin;


    public User(String p){
        pin = p;
        chequings = new ChequingAccount();
        credit = new CreditAccount();
        savings = new SavingsAccount();

    }

    public String getPin(){
        return pin;
    }

    public ChequingAccount getChequings() {
        return chequings;
    }

    public CreditAccount getCredit() {
        return credit;
    }

    public SavingsAccount getSavings() {
        return savings;
    }


}
