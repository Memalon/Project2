import java.util.Scanner;

// Вывести блок цифр "5" n-е количество раз с помощью метода

public class Five_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку текста: ");
        String a = sc.nextLine();
        System.out.println("Введите число повторов: ");
        int b = sc.nextInt();

        a = Matrix(a);
        Print(b,a);

    }
    public static String Matrix(String a) {
        a = a + " " + a + " " + a + " " + a + " " + a + " " + a;
        return a;
    }
    public static void Print(int b, String a) {
        int i = 0;
        while (i != b) {
            i += 1;
            System.out.println(a);
        }
    }
}
