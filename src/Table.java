public class Table {
    public static void main(String[] args) {
        // Напечатать полную таблицу сложения для каждого простого числа (от 1 до 9)
        // 1 + 1 = 2    1 + 2 = 3   ... 1 + 9 = 10
        // 2 + 1 = 3    2 + 2 = 4   ... 2 + 9 = 11
        // и тд.
        int a = 1;
        int b = 1;
        while (b != 10) {
            printRaw(a,b);
            b++;
        }


    }
    public static int fun(int a, int b) {
        int sum = b + a;
        System.out.printf("%d + %d = %d        ", b, a, sum);
        a++; // a = a + 1;
        return a;
    }

    public static void printRaw(int a, int b) {
        a = fun(a,b);
        a = fun(a,b);
        a = fun(a,b);
        a = fun(a,b);
        a = fun(a,b);
        a = fun(a,b);
        a = fun(a,b);
        a = fun(a,b);
        fun(a,b);
        a = 1;
        System.out.println();
    }

}
