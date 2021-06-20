package org.assignment3.ex45.base;


public class Solution45 {
    public static void main(String[] args){
        prompt ask = new prompt();
        readFile read = new readFile();
        writeFile write = new writeFile();
        swapWord swap = new swapWord();
        //prompt for file name
        String fileName = ask.askFileName();
        //read file
        String origString = read.read();
        //change words
        String replacedString = swap.replace(origString);
        //write to output
        write.write(replacedString,fileName);
    }
}
