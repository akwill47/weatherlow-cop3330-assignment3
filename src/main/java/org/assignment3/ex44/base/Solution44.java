package org.assignment3.ex44.base;

public class Solution44 {
    public static void main(String[] args){
        parse grab = new parse();
        display out = new display();
        //prompt for product

        //parse json file for info
        String output = grab.data();
        //display result
        out.output(output);
    }
}
