package org.assignment3.ex46.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class readFile {
    public String read(){
        String input = new String();
        Path fileName = Path.of("src/main/java/org/assignment3/ex46/base/exercise46_input.txt");

        try {
            input = Files.readString(fileName);
        }catch(IOException e){
            System.out.println("Error reading");
        }
        input = input.replace("\r\n"," ");
        return input;
    }
}
