import java.util.Scanner;

//Реализовать функцию на хождения минимума:
//        1.Из трёх чисел
//        2.Из четырёх чисел

public class Min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите третее число: ");
        int num3 = sc.nextInt();
        sc.close();

        System.out.println("Наименьшее из двух первых чисел: ");
        System.out.println(Min2(num1,num2));

        System.out.println("Наименьшее из трех чисел: ");
        System.out.println(Min3(num1,num2,num3));


    }
    public static int Min2(int a, int b) {
        if (a > b)
            return b;
        else
            return a;
    }

    public static int Min3(int a, int  b, int c) {
        if (a > b) {
            if (b > c) {
                return c;
            }
            else
                return b;
        }
        else {
            if (a > c) {
                return c;
            }
            else
                return a;
        }
    }
}
