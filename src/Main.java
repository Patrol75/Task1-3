public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{1, 2, 5, 4, 3});
        System.out.println(salesManager.max());
        System.out.println(salesManager.stat());
    }
}
