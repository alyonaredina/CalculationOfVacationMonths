package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcVServiceTest {

    @Test
    public void testFirst() {
        CalcVService service = new CalcVService();

        int expected = 3;
        int actual = service.calcVacation(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testSecond() {
        CalcVService service = new CalcVService();

        int expected = 2;
        int actual = service.calcVacation(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
