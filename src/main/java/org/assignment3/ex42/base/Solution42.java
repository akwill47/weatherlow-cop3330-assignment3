package org.assignment3.ex42.base;
import java.util.ArrayList;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution42 {
    public static void main(String[] args){
        input get = new input();
        parse adjust = new parse();
        print display = new print();
        //read input file
        ArrayList<String> rawInput = new ArrayList<>();
        int size;
        rawInput = get.readFile();
        size = get.count(rawInput);


        //parse data from input file via string split
        ArrayList<String[]> splitData = new ArrayList<>();
        adjust.splitData(rawInput,size,splitData);
        //display data in tabular format
        display.display(splitData,size);
    }
}
