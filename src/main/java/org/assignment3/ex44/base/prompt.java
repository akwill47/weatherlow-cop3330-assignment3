package org.assignment3.ex44.base;
import java.util.Scanner;
public class prompt {
    Scanner in = new Scanner(System.in);
    public String item(){
        System.out.print("What is the product name? ");

        return in.nextLine();
    }
}
