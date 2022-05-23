package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    public void shouldCalcBonusIfSmallAmountAndRegistered(int amount, boolean isRegistered, int expected) {
        BonusService service = new BonusService();

        int actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    public void shouldCalcBonusIfHugeAmountAndNotRegistered(int amount, boolean isRegistered, int expected) {
        BonusService service = new BonusService();

        int actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    public void shouldCalcBonusIfSmallAmountAndNotRegistered(int amount, boolean isRegistered, int expected) {
        BonusService service = new BonusService();

        int actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    public void shouldCalcBonusIfHugeAmountAndRegistered(int amount, boolean isRegistered, int expected) {
        BonusService service = new BonusService();

        int actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

}
