package org.assignment3.ex45.base;

import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public void write(String replacedString,String prompt){
        String path = prompt+".txt";
        try{
            FileWriter writer = new FileWriter(path);
            writer.write(replacedString);
            writer.close();
        }catch(IOException e){
            System.out.println("Error writing");
        }
    }
}
