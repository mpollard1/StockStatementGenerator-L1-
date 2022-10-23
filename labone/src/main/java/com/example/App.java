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
        
        System.out.println(testAccountInfo(testAccount()));
        
        
    }
    static String testAccountInfo(Account account){
        String testString = "Account Number: " + account.getAccountNum() + "  SSN: " + account.getSSN() + "  First Name: " + account.getFirstName() + "  Last Name: " + account.getLastName() + "  Email: " +  account.getEmail() +  "  Phone Number: " +  account.getPhoneNum() +  "  Beginning Balance: " + account.getBeginningBal() +  "  " + account.getTransactions();
        return testString;
    }

    static Account testAccount(){
        Transaction transactionOne = new Transaction();
        Account account = new Account();

        transactionOne.setType("Sell");
        transactionOne.setStockSymbol("CTBB");
        transactionOne.setPricePerShare(359.4);
        transactionOne.setShareCount(7866);
        transactionOne.setTotalTrans(transactionOne.getShareCount(), transactionOne.getPricePerShare());
        transactionOne.setStockTotal(transactionOne.getTotalTrans(), transactionOne.getType());
        transactionOne.setCashTotal(transactionOne.getTotalTrans(), account.getBeginningBal(), transactionOne.getType());
        account.setAccountNum(1);
        account.setSSN("418-99-5984");
        account.setFirstName("Margalo");
        account.setLastName("Trobey");
        account.setEmail("mtrobey0@cocolog-nigty.com");
        account.setPhoneNum("654-711-3196");
        account.setBeginningBal(7680675.39);
        account.addTransaction(transactionOne);
        return account;
    }
    static void ReadJson(){
        //Will not read stock.json ughhhhhhhhhhhhh
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

}
