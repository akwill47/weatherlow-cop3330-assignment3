package org.assignment3.ex46.base;
import java.util.ArrayList;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution46 {
    public static void main(String[] args){
        readFile read = new readFile();
        parse  getWords = new parse();
        countOccurrences count = new countOccurrences();
        display output = new display();
        //read file as a string
        String input = read.read();
        //separate each unique word into an array
        ArrayList<String> uniqueWords = getWords.separateWord(input);
        //count occurrences
        int[] wordCount = count.count(uniqueWords,input);
        //display histogram
        output.histogram(uniqueWords,wordCount);
    }
}
