package ru.netology.stats;

public class StatsService {
    public void main(String[] args) {
        int[] arr = new int[]{
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println(totalAmount(arr));
    }

    public int totalAmount(int[] sales) {
        int totalAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            totalAmount = sales[i] + totalAmount;

        }

        return totalAmount;
    }

    public int avg(int[] sales) {
        return totalAmount(sales) / 12;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 5;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int lowerAvgCount(int[] sales) {
        int avg = avg(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }
        return count;
    }

    public int upperAvgCount(int[] sales) {
        int avg = avg(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count++;
            }
        }
        return count;
    }
}

