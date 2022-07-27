package ru.netology.statistic;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {
    StatisticService service = new StatisticService();
    public long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sum() {
        long expected = 180;
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void average() {
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.average(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinMonthSales() {
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxMonthSales() {
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthsOfSalesBelowAverage() {
        long expected = 5;
        long actual = service.countBelowAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MonthsOfSalesAboveAverage() {
        long expected = 5;
        long actual = service.countAboveAvg(sales);
        Assertions.assertEquals(expected, actual);
    }


}
