package com.company;
import java.util.*;
public class Transaction{
    private double amount;//amount of this trasaction
    private Date timestamp;//time and date of this transcationn
    private Account inAccount;//the account in which transaction is performed

    public Transaction(double amount,Account inAccount){
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
    }
    public double getAmount(){
        return this.amount;
    }
    public String getSummaryLine(){
        if(this.amount >= 0){
            return String.format(this.timestamp.toString()+" : $"+this.amount);
        }else{
            return String.format(this.timestamp.toString()+" : $("+this.amount);
        }
    }

}
