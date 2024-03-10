package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcVServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/parameter.csv")
    public void testFirst(int expected, int income, int expense, int threshold) {
        CalcVService service = new CalcVService();

        //int expected = 3;
        int actual = service.calcVacation(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void testSecond() {
//        CalcVService service = new CalcVService();
//
//        int expected = 2;
//        int actual = service.calcVacation(100_000, 60_000, 150_000);

//        Assertions.assertEquals(expected, actual);
//    }
}
