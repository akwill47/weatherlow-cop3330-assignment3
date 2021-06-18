package org.assignment3.ex43.base;
import java.util.Scanner;
public class input {
    Scanner in = new Scanner(System.in);
    public String author(){
        System.out.print("Author: ");
        return(in.nextLine());
    }
    public String siteName(){
        System.out.print("Site Name: ");
        return(in.nextLine());
    }
    public String jsPrompt(){
        System.out.print("Do you want a folder for JavaScript? ");
        return(in.nextLine());
    }
    public String cssPrompt(){
        System.out.print("Do you want a folder for CSS? ");
        return(in.nextLine());
    }
}
