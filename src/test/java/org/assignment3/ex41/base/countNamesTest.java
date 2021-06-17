package org.assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class countNamesTest {

    @Test
    void count() {
        input count = new input();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Bob");testList.add("tim");testList.add("juan");testList.add("difo");

        int actual = count.count(testList);

        assertEquals(4,actual);
    }
}