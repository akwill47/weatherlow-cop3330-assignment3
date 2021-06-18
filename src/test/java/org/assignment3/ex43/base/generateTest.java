package org.assignment3.ex43.base;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class generateTest {

    @Test
    void createHtml() {
        generate create = new generate();
        boolean actual=false;
        try{
            actual = create.createHtml("will","hello");
        }catch(IOException e){

        }
        assertTrue(actual);
    }

    @Test
    void createDirs_pass_all() {
        generate create = new generate();
        int actual =0;

        actual = create.createDirs("will","hello","y","y");

        assertEquals(3,actual);
    }
    @Test
    void createDirs_pass_no_folders() {
        generate create = new generate();
        int actual =0;

        actual = create.createDirs("will","hello","n","n");

        assertEquals(1,actual);
    }
}
