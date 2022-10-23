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
        Transaction trans = new Transaction();
        trans.setCashTotal(20, 50, "Buy");
        assertEquals(30, trans.getCashTotal());
    }

    @Test
    void testCashSell(){
        Transaction trans = new Transaction();
        trans.setCashTotal(20, 50, "Sell");
        assertEquals(70, trans.getCashTotal());
    }

    @Test
    void testStockBuy(){
        Transaction trans = new Transaction();
        trans.setStockTotal(20, "Buy");
        assertEquals(20, trans.getStockTotal());
    }
    @Test
    void testStockSell(){
        Transaction trans = new Transaction();
        trans.setStockTotal(20, "Sell");
        assertEquals(-20, trans.getStockTotal());
    }
}
