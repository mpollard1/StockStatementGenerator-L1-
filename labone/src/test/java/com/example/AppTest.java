package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {
    
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testCashBuy(){
        assertEquals(20, App.BuyCash(21,1));
    }
    @Test
    void testCashSell(){
        assertEquals(20, App.SellCash(19,1));
    }

    @Test
    void testTotalCash(){
        assertEquals(20, App.CashTotal(5,4));
    }

    @Test
    void testStockTotalSell(){
        assertEquals(20, App.StockTotal("Sell",1, 21));
    }

    @Test
    void testStockTotalBuy(){
        assertEquals(20, App.StockTotal("Buy", 1, 19));
    }
}
