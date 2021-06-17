package org.assignment3.ex42.base;

import java.util.ArrayList;
import java.util.Collections;

public class parse {
    public String splitData(ArrayList<String> nameList,int nameCount,ArrayList<String[]> splitData) {
        boolean check=false;
        try{
            for(int i =0;i<nameCount;i++) {
                splitData.set(i,(nameList.get(i).split(",")));

            }
        }catch(Error e){
            System.out.print("Error parsing data");
        }
        check = true;
        if(check)
            return "Data parse successful";

        else return "Data parse unsuccessful";
    }

}
