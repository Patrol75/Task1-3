package ru.netology;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = 10;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long stat() {
        long sum = 0;
        long count = 0;
        boolean minCount = false;
        boolean maxCount = false;
        long max = this.max();
        long min = this.min();
        for (long sale : sales) {
            if (sale != min || minCount) {
                if (sale != max || maxCount) {
                    sum += sale;
                    count++;
                } else {
                    maxCount = true;
                }
            } else {
                minCount = true;
            }
        }
        return sum / count;
    }
}