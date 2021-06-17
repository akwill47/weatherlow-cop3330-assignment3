package org.assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class sortTest {

   @Test
    void sort_pass() {
        sort adjust = new sort();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Bob");testList.add("tim");testList.add("juan");testList.add("difo");

        String actual = adjust.sort(testList);

        assertEquals("Alphabetical sort successful",actual);
    }
    @Test
    void sort_fail() {
        sort adjust = new sort();
        ArrayList<String> testList = new ArrayList<>();

        String actual = adjust.sort(testList);

        assertEquals("Alphabetical sort unsuccessful",actual);
    }


}