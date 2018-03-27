package com.company;

import java.util.ArrayList;

public class Transaction {
    private Money mon;
    //form is plus or minus
    private String form;
    //this doesnt work, maybe call a add to list method in other classes when a transaction is made
    private static ArrayList<Transaction> translist = new ArrayList<Transaction>();

    //Transaction tran;

    public Transaction(Money m, String f){
        mon = m;
        form =f;

    }

    public String getForm(){
        return form;
    }

    public Money getMoney(){
        return mon;
    }



}
