package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    private StatsService service = new StatsService();
    private long[] arr = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void totalAmount() {
        long expected = 180;
        long actual = service.totalAmount(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avg() {
        long expected = 15;
        long actual = service.avg(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        long expected = 6;
        long actual = service.maxSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        long expected = 9;
        long actual = service.minSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerAvgCount() {
        long expected = 5;
        long actual = service.lowerAvgCount(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperAvgCount() {
        long expected = 5;
        long actual = service.upperAvgCount(arr);
        Assertions.assertEquals(expected, actual);
    }
}

