package org.assignment3.ex43.base;
import java.io.IOException;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 William Weatherlow
 */
public class Solution43 {
    public static void main(String[] args){
        input get = new input();
        generate create = new generate();
        //prompt for author/name and if user wants js/css files
        String author = get.author();
        String siteName = get.siteName();
        String js = get.jsPrompt();
        String css = get.cssPrompt();
        //generate directories
        create.createDirs(author,siteName,css,js);
        //generate html file
        try {
            create.createHtml(author, siteName);
        }catch(IOException e){
            System.out.print("Error generating html file");
        }
    }
}
