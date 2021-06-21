package org.assignment3.ex46.base;

import java.util.ArrayList;

public class countOccurrences {
    public int[] count(ArrayList<String> uniqueWords,String input){
        String[] temp = input.split(" ");
        int[] wordCount = new int[uniqueWords.size()];
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<uniqueWords.size();j++){
                if(uniqueWords.get(j).equals(temp[i])){
                    wordCount[j] += 1;
                }
            }
        }
        return wordCount;
    }
}
