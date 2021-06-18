package org.assignment3.ex42.base;

import org.assignment3.ex41.base.sort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class parseTest {

    @Test
    void split_pass() {
        parse split = new parse();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Bob,dog,20323");testList.add("tim,rob,5623");testList.add("juan,yes,12312");testList.add("difo,god,6969");
        ArrayList<String[]> testSplit = new ArrayList<>();
        String actual = split.splitData(testList,4,testSplit);
        assertEquals("Data parse successful",actual);
        }
    @Test
    void split_fail() {
        parse split = new parse();
        ArrayList<String> testList = new ArrayList<>();

        ArrayList<String[]> testSplit = new ArrayList<>();
        String actual = split.splitData(testList,4,testSplit);
        assertEquals("Data parse unsuccessful",actual);
    }
}
