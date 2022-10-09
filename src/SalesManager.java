public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = 10;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int stat() {
        int sum = 0;
        int count = 0;
        int max = this.max();
        int min = this.min();
        for (int sale : sales) {
            if (sale != min && sale != max) {
                sum += sale;
                count++;
            }
        }
        return sum / count;
    }
}