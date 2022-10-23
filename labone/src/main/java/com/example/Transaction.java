package com.example;

public class Transaction {
    private String type;
    private String stockSymbol;
    private int pricePerShare;
    private int countShares;
    private int totalTransaction;
    private int totalStockValue;
    private int totalCashValue;
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

    public void setPricePerShare(int pricePerShareStr){
        pricePerShare = pricePerShareStr;
    }

    public int getPricePerShare(){
        return pricePerShare;
    }

    public void setShareCount(int countSharesInt){
        countShares = countSharesInt;
    }

    public int getShareCount(){
        return countShares;
    }

    public void setTotalTrans(int shareCount, int countPrice){
        int total = shareCount * countPrice;
        totalTransaction = total;
    }

    public int getTotalTrans(){
        return totalTransaction;
    }

    public void setCashTotal(int totalTransaction, int begBal, String stockType){
        if(stockType == "Sell"){
            totalCashValue = begBal + totalTransaction;
        }else if(stockType == "Buy"){
            totalCashValue = begBal - totalTransaction;
        }
    }

    public int getCashTotal(){
        return totalCashValue;
    }

    public void setStockTotal(int totalTransaction, String stockType){
        totalStockValue = 0;
        if(stockType == "Sell"){
            totalStockValue = totalStockValue - totalTransaction;
        }else if(stockType == "Buy"){
            totalStockValue = totalStockValue + totalTransaction;
        }
    }

    public int getStockTotal(){
        return totalStockValue;
    }

}
