package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitTest {

    @Test
    void InitProjectSetting(){
        Init title = new Init();
        Assertions.assertEquals("BOOTCAMP", title.whoIsTheStorage());
    }
}