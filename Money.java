package com.company;

public class Money {
    //type is cheque, cash, tranfer, purchase etc
    private String type;
    private double amount;

    public Money(String t, double a){
        type = t;
        amount = a;
    }

    public double getAmount(){
        return amount;
    }


    public String toString() {
       return type + "   Amount: " + amount;
    }
}
