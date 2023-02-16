public class Main {

    public static void main(String[] args) {
        int[] sales = new int[] {1, 2, 400, 600};
        SalesManager salesManager = new SalesManager(sales);

       int max = salesManager.max();
       int min = salesManager.min();
       int avarage = salesManager.average();

       System.out.println(max);
        System.out.println(min);
        System.out.println(avarage);
    }
}
