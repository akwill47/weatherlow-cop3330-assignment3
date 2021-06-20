package org.assignment3.ex44.base;

import com.google.gson.JsonArray;

public class Solution44 {
    public static void main(String[] args){
        parse grab = new parse();
        display out = new display();
        readFile read = new readFile();
        //prompt for product
            //is called inside parse class
        //read file
        JsonArray jsonArr = read.read();
        //parse json array for info
        String output = grab.data(jsonArr);
        //display result
        out.output(output);
    }
}
