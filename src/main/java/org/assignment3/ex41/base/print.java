package org.assignment3.ex41.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class print {
    public void display(ArrayList<String> nameList,int nameCount){
        try{
            File fp = new File("exercise41_output.txt");
            fp.createNewFile();
        }catch(IOException e){
            System.out.println("File creation error");
        }

        try{
            String text ="Total of " + nameCount + " names\n" +"-----------------\n";
            FileWriter output = new FileWriter("exercise41_output.txt");
            output.write(text);
            for(int i =0;i<nameCount;i++){
                output.write(nameList.get(i));
                output.write("\n");
            }
            output.close();
        }catch(IOException e){
            System.out.println("Write error");
        }
    }
}
