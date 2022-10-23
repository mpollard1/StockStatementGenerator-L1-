package com.example;

public class Transaction {
    private String type;
    private String stockSymbol;
    private int pricePerShare;
    private int countShares;
    private int totalTransaction;


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


}
