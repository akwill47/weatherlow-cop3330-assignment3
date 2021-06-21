package org.assignment3.ex42.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class input {
    public ArrayList<String> readFile(){
        ArrayList<String> nameList = new ArrayList<String>();
        int count=0;
        try {
            File fp = new File("src/main/java/org/assignment3/resources/exercise42_input.txt");
            Scanner in = new Scanner(fp);

            while(in.hasNextLine()){
                nameList.add(in.nextLine());


            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.print("Error reading file");
        }

        return nameList;
    }
    public int count(ArrayList<String> nameList){
        int nameCount = nameList.size();
        return nameCount;
    }
}
