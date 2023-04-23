package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(1100);
        int actual = 900;

        assertEquals(actual,expected);

    }
    @Test
    public void testRemain2() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = cashbackHackService.remain(2000);
        int actual = 0;

        assertEquals(actual,expected);

    }


}