package ru.netology.stats;

public class StatsService {

    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(long[] sales) {
        int average = calculateSum(sales) / sales.length;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sales[maxMonth] <= sale) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int monthBelow = 0;
        long average = findAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                monthBelow += 1;
            }
        }
        return monthBelow;
    }

    public int monthsAboveAverage(long[] sales) {
        int monthAbove = 0;
        long average = findAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                monthAbove += 1;
            }
        }
        return monthAbove;
    }
}
