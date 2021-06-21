package org.assignment3.ex44.base;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class parseTest {
Scanner in = new Scanner(System.in);
    @Test
    void data_3070() {
        parse testParse = new parse();
        readFile testRead = new readFile();
        String actual = testParse.data(testRead.read("exercise44test_input.json"),"3070ti");
        String expected = "3070ti,2000.00,0";
        assertEquals(expected,actual);


    }


    @Test
    void data_jetpack() {
        parse testParse = new parse();
        readFile testRead = new readFile();
        String actual = testParse.data(testRead.read("exercise44test_input.json"),"jetpack");
        String expected = "jetpack,5000.00,999";
        assertEquals(expected,actual);


    }

    @Test
    void data_iphone() {
        parse testParse = new parse();
        readFile testRead = new readFile();
        String actual = testParse.data(testRead.read("exercise44test_input.json"),"Iphone");
        String expected = "Iphone,699.00,2";
        assertEquals(expected,actual);


    }
}