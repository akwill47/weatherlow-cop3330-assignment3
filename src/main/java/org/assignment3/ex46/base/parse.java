package org.assignment3.ex46.base;

import java.util.ArrayList;

public class parse {
    public ArrayList<String> separateWord(String input) {
        String[] temp = input.split(" ");
        ArrayList<String> uniqueWords= new ArrayList<>();
        uniqueWords.add(temp[0]);
        int count =1;
        int check;
        for(int i=0;i<temp.length;i++){
            check =0;
            for(int j=0;j<count;j++){
            if(uniqueWords.get(j).equals(temp[i]))
                check =1;

            }
            if(check==0){
                uniqueWords.add(temp[i]);
                count++;
            }
        }
        return uniqueWords;
    }
}
