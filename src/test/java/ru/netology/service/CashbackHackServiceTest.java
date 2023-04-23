package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest extends CashbackHackService {

    @Test
    public void whenAmountOverBoundary() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(1100);
        int actual = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void whenAmountMultiplyBoundary() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(2000);
        int actual = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void whenAmountLessBoundary() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(950);
        int actual = 50;

        assertEquals(actual, expected);

    }

}