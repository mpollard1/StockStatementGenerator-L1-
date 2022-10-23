package com.example;

public class Transaction {
    private String type;
    private String stockSymbol;
    private double pricePerShare;
    private int countShares;
    private double totalTransaction;
    private double totalStockValue;
    private double totalCashValue;
    public void setType(String typeStr){
        type = typeStr;
    }

    public String getType(){
        return type;
    }

    public void setStockSymbol(String stockSymStr){
        stockSymbol = stockSymStr;
    }

    public String getStockSymbol(){
        return stockSymbol;
    }

    public void setPricePerShare(double pricePerShareStr){
        pricePerShare = pricePerShareStr;
    }

    public double getPricePerShare(){
        return pricePerShare;
    }

    public void setShareCount(int countSharesInt){
        countShares = countSharesInt;
    }

    public int getShareCount(){
        return countShares;
    }

    public void setTotalTrans(int shareCount, double countPrice){
        double total = shareCount * countPrice;
        totalTransaction = total;
    }

    public double getTotalTrans(){
        return totalTransaction;
    }

    public void setCashTotal(double totalTransaction, double begBal, String stockType){
        if(stockType == "Sell"){
            totalCashValue = begBal + totalTransaction;
        }else if(stockType == "Buy"){
            totalCashValue = begBal - totalTransaction;
        }
    }

    public double getCashTotal(){
        return totalCashValue;
    }

    public void setStockTotal(double totalTransaction, String stockType){
        totalStockValue = 0;
        if(stockType == "Sell"){
            totalStockValue = totalStockValue - totalTransaction;
        }else if(stockType == "Buy"){
            totalStockValue = totalStockValue + totalTransaction;
        }
    }

    public double getStockTotal(){
        return totalStockValue;
    }

}
