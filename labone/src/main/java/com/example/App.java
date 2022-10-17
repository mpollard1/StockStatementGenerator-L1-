package com.example;
import com.aspose.cells.Workbook;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
    }

    static int BuyCash(int begBal, int total){
        return begBal - total;
    }

    static int SellCash(int begBal, int total){
        return begBal + total;
    }

    static int CashTotal(int sharesNum, int sharePrice){
        return sharesNum * sharePrice;
    }

    static int StockTotal(String transVal, int cashTotal, int stockTotal){
        
        if(transVal == "Sell"){
            stockTotal = stockTotal - cashTotal;
        } else if(transVal == "Buy"){
            stockTotal = stockTotal + cashTotal;
        }
        return stockTotal;
    }

}
