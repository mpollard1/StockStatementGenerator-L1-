package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Account {
    private int accountNumber;
    private String ssn;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double begBal;
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public void setAccountNum(int accNum){
        accountNumber = accNum;
    }

    public int getAccountNum(){
        return accountNumber;
    }

    public void setSSN(String ssnStr){
        ssn = ssnStr;
    }

    public String getSSN(){
        return ssn;
    }

    public void setFirstName(String first){
        firstName = first;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String last){
        lastName = last;
    }

    public String getLastName(){
        return lastName;
    }

    public void setEmail(String emailStr){
        email = emailStr;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNum(String phone){
        phoneNumber = phone;
    }

    public String getPhoneNum(){
        return phoneNumber;
    }

    public void setBeginningBal(double bal){
        begBal = bal;
    }

    public double getBeginningBal(){
        return begBal;
    }

    public void addTransaction(Transaction trans){
        transactions.add(trans);
    }

    public List<Transaction> getTransactionsList(){
        return transactions;
    }

    public StringBuilder getTransactions(){
        StringBuilder tranString = new StringBuilder("Transactions: ");
        for (Transaction transaction : transactions) {
            tranString.append("{ Type: " + transaction.getStockSymbol() + " Symbol: " + transaction.getStockSymbol() + " PricePerShare: " + transaction.getPricePerShare() + " Share Count: " + transaction.getShareCount() + " Total Transaction: " + transaction.getTotalTrans() + " Total Stock Value: " + transaction.getStockTotal() + " Total Cash Value: " + transaction.getCashTotal() + " },");
            
        }

        return tranString;
    }
}
