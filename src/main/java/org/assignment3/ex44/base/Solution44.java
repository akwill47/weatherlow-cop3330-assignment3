package org.assignment3.ex44.base;
import com.google.gson.JsonArray;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution44 {
    public static void main(String[] args){
        parse grab = new parse();
        display out = new display();
        readFile read = new readFile();
        //read file
        JsonArray jsonArr = read.read();

        //prompt for item(called inside the parse class)
            //parse json Array for info
        String output = grab.data(jsonArr);

        //display result
        out.output(output);
    }
}
