package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesManagerTest {
    SalesManager salesManager = new SalesManager(new long[]{1, 2, 5, 4, 3});

    @Test
    void max() {
        long expect = 5;
        long result = salesManager.max();
        Assertions.assertEquals(expect, result);
    }

    @Test
    void min() {
        long expect = 1;
        long result = salesManager.min();
        Assertions.assertEquals(expect, result);
    }

    @Test
    void stat() {
        long expect = 3;
        long result = salesManager.stat();
        Assertions.assertEquals(expect, result);
    }
}