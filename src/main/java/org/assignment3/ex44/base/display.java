package org.assignment3.ex44.base;

public class display {
    public void output(String unsplitData){
        String[] split;
        split = unsplitData.split(",");
        System.out.printf("Name: %s\nPrice: %s\nQuantity: %s",split[0],split[1],split[2]);
    }
}
