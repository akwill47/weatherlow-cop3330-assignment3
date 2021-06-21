package org.assignment3.ex44.base;
import com.google.gson.*;
import java.io.*;
public class parse {
    public String data(JsonArray jsonArr,String item) {
        prompt get = new prompt();
        String tempName;
        String price = new String();
        String quantity= new String();
        while(true) {
            tempName = "\""+item+"\"";
                for (int i = 0; i < jsonArr.size(); i++) {
                    JsonObject rootObj = (JsonObject) jsonArr.get(i);
                    if ((rootObj.get("name").toString()).equals(tempName)) {
                        price = rootObj.get("price").toString();
                        quantity = rootObj.get("quantity").toString();

                        return item + "," + price + "," + quantity;
                    }
                }
            System.out.println("Sorry, that product was not found in our inventory.");
            item=get.item();
        }

    }
}
