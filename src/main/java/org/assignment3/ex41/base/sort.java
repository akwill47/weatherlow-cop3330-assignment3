package org.assignment3.ex41.base;

import java.util.ArrayList;
import java.util.Collections;


public class sort {
    public String sort(ArrayList<String> nameList) {
        boolean check=false;

        try {
            Collections.sort(nameList);
            if(nameList.size()>0)
            check = true;
        }catch(Error e){
            System.out.print("Error");
        }



        if(check)
            return "Alphabetical sort successful";

        else return "Alphabetical sort unsuccessful";
    }
}
