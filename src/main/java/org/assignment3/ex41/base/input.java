package org.assignment3.ex41.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

public class input {
    public ArrayList<String> readFile(){
        ArrayList<String> nameList = new ArrayList<String>();
        try {
            File fp = new File("C:\\Users\\wilwe\\IdeaProjects\\weatherlow-cop3330-assignment3\\src\\main\\java\\org\\assignment3\\ex41\\exercise41_input.txt");
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
        int nameCount = nameList.size();;
        return nameCount;
    }
}