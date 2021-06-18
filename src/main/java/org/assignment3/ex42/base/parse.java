package org.assignment3.ex42.base;

import java.util.ArrayList;
import java.util.Collections;

public class parse {
    public String splitData(ArrayList<String> nameList,int nameCount,ArrayList<String[]> splitData) {
        boolean check=false;
        String temp1;
        String[] temp;
        try{
            for(int i =0;i<nameCount;i++) {
                temp1 = nameList.get(i);
                temp = temp1.split(",");
                splitData.add(i,temp);

            }
            check = true;
        }catch(IndexOutOfBoundsException e){
            System.out.print("Error parsing data");
        }
        if(check)
            return "Data parse successful";

        else return "Data parse unsuccessful";
    }

}
