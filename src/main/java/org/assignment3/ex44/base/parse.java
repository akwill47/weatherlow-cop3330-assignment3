package org.assignment3.ex44.base;
import com.google.gson.*;
import java.io.*;
public class parse {
    public String data() {
        prompt get = new prompt();
        File input = new File("C:\\Users\\wilwe\\IdeaProjects\\weatherlow-cop3330-assignment3\\src\\main\\java\\org\\assignment3\\ex44\\base\\exercise44_input.json");
        String item = get.item();
        String tempName = "\""+item+"\"";
        String price = new String();
        String quantity= new String();
        while(true) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(input));
                Gson gson = new Gson();
                JsonObject js = gson.fromJson(br, JsonObject.class);
                JsonArray jsonArr = js.getAsJsonArray(("products"));

                for (int i = 0; i < jsonArr.size(); i++) {
                    JsonObject rootObj = (JsonObject) jsonArr.get(i);
                    if ((rootObj.get("name").toString()).equals(tempName)) {
                        price = rootObj.get("price").toString();
                        quantity = rootObj.get("quantity").toString();

                        return item + "," + price + "," + quantity;
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.print("Error reading file");
            }
            System.out.println("Sorry, that product was not found in our inventory.");
            item=get.item();
        }

    }
}
