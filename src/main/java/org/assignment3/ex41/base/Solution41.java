package org.assignment3.ex41.base;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution41 {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        input get = new input();
        sort adjust = new sort();
        int nameCount;
        print output = new print();
        ArrayList<String>nameList = new ArrayList<>();
        //read file and input data into an array

        nameList = get.readFile();

        //sort data alphabetically

        adjust.sort(nameList);
        //calc num of nums
        nameCount = get.count(nameList);
        //display data
        output.display(nameList,nameCount);
    }
}
