package org.assignment3.ex45.base;

import java.util.Scanner;

public class prompt {
    Scanner in = new Scanner(System.in);
    public String askFileName(){
        System.out.print("What file name do you want to use for the output? Do not include the file extension: ");
        String fileName= new String();
        fileName = in.nextLine();
        return fileName;
    }
}
