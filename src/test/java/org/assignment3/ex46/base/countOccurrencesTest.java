package org.assignment3.ex46.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class countOccurrencesTest {

    @Test
    void count_letters() {
        countOccurrences count = new countOccurrences();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("a");temp.add("b");temp.add("c");
        String testString ="a b c c b a a b c a b c a c b a";
        int[] expected = new int[]{6,5,5};
        int[] actual = count.count(temp,testString);

        assertArrayEquals(expected,actual);
    }

    @Test
    void count_words() {
        countOccurrences count = new countOccurrences();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("bob");temp.add("hello");temp.add("jim");
        String testString ="hello bob how are you doing, i'm jim it's nice to meet you bob says jim";//bruh i just wanted to see if it could parse a string
        int[] expected = new int[]{2,1,2};
        int[] actual = count.count(temp,testString);

        assertArrayEquals(expected,actual);
    }
}