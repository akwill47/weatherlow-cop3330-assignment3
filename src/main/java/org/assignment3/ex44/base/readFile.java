package org.assignment3.ex44.base;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readFile {
    public JsonArray read(String fileName) {
        String path = "src/main/java/org/assignment3/resources/"+fileName;
        File input = new File(path);
        JsonArray jsonArr = new JsonArray();

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            Gson gson = new Gson();
            JsonObject obj = gson.fromJson(br, JsonObject.class);
            jsonArr = obj.getAsJsonArray(("products"));
            return jsonArr;
        }catch(FileNotFoundException e){
            System.out.print("Error reading file");
        }

        return jsonArr;
    }
}
