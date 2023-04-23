package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void whenAmountOverBoundary() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(1100);
        int actual = 900;

        assertEquals(actual,expected);

    }
    @Test
    public void whenAmountMultiplyBoundary() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(2000);
        int actual = 0;

        assertEquals(actual,expected);

    }

    @Test
    public void whenAmountLessBoundary() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(950);
        int actual = 50;

        assertEquals(actual,expected);

    }


}