package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    private StatsService service = new StatsService();
    private int[] arr = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void totalAmount() {
        int expected = 180;
        int actual = service.totalAmount(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avg() {
        int expected = 15;
        int actual = service.avg(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        int expected = 6;
        int actual = service.maxSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        int expected = 9;
        int actual = service.minSales(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerAvgCount() {
        int expected = 5;
        int actual = service.lowerAvgCount(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperAvgCount() {
        int expected = 5;
        int actual = service.upperAvgCount(arr);
        Assertions.assertEquals(expected, actual);
    }
}

