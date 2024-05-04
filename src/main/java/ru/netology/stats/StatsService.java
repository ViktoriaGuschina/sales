package ru.netology.stats;

public class StatsService {
    public long totalAmount(long[] sales) {
        long totalAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            totalAmount = sales[i] + totalAmount;

        }

        return totalAmount;
    }

    public long avg(long[] sales) {
        return totalAmount(sales) / 12;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 5;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long lowerAvgCount(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }
        return count;
    }

    public long upperAvgCount(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count++;
            }
        }
        return count;
    }
}

