package org.assignment3.ex45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class swapWordTest {

    @Test
    void replace() {
        swapWord change = new swapWord();
        String test ="utilize utilize hello i utilize and enjoy utilizeing so much!!";
        String actual = change.replace(test);
        assertEquals("use use hello i use and enjoy useing so much!!",actual);
    }


    @Test
    void replace_with_DIFO() {
        swapWord change = new swapWord();
        String test ="utilize DIFO utilize GOD utilize GOD utilize DIFO utilize";
        String actual = change.replace(test);
        assertEquals("use DIFO use GOD use GOD use DIFO use",actual);
    }
}