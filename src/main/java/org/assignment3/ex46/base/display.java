package org.assignment3.ex46.base;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;

public class display {
    public void histogram(ArrayList<String> uniqueWords,int[] wordCount){
        String temp="*";
        for(int i=0;i<uniqueWords.size();i++){

            System.out.printf("%-10s%s\n",uniqueWords.get(i)+":", temp.repeat(wordCount[i]));
        }
    }
}
