package com.example;
import com.aspose.cells.Workbook;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        
        
    }

    static void ReadJson(){
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("stock.json")){
            Object obj = jsonParser.parse(reader);

            JSONArray accountList = (JSONArray) obj;
            System.out.println(accountList);

            accountList.forEach(acc -> parseAccountObject((JSONObject) acc));

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ParseException e){
            e.printStackTrace();
        }

    }

    static void parseAccountObject( JSONObject account){
        JSONObject accountObject = (JSONObject) account.get("account");

        String firstName = (String) accountObject.get("firstName");
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
