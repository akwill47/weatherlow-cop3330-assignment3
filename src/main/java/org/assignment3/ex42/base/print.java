package org.assignment3.ex42.base;

import java.util.ArrayList;

public class print {
    public void display(ArrayList<String[]> splitData,int size){
        String[] temp;
        System.out.printf("Last      First     Salary\n--------------------------\n");
        for(int i=0;i<size;i++){
            temp=splitData.get(i);
            System.out.printf("%-10s%-10s%-10s\n",temp[0],temp[1],temp[2]);

        }
    }
}
