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
    private int begBal;
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

    public void setBeginningBal(int bal){
        begBal = bal;
    }

    public int getBeginningBal(){
        return begBal;
    }

    public void addTransaction(Transaction trans){
        transactions.add(trans);
    }

    public List<Transaction> getTransactions(){
        return transactions;
    }
}
