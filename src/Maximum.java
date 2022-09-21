import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два целых числа:");

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Наибольшее из двух чисел:");
        System.out.println(Maxi(x,y));

    }
    public static int Maxi(int a, int b) {
        if (a > b)
            return a;
        else
            return b;

    }


}


