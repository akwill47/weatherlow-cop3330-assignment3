package org.assignment3.ex45.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class readFile {
    public String read(){
        String getString = new String();
        try {
            Path fileName = Path.of("src/main/java/org/assignment3/resources/exercise45_input.txt");
            getString = Files.readString(fileName);
        }catch(IOException e){
            System.out.println("Error reading file");
        }

        return getString;
    }
}
