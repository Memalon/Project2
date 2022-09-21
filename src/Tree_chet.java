import java.util.Scanner;

//На вход подаётся три целых числа.
// Выведите максимальное чётное из них.
// Если чётных чисел нет, выведите "Чётных чисел нет".

public class Tree_chet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0)) {
            if ((a >= b && b >= c) ||  (a >= c && c >= b)){
                System.out.println(a);
            }
            else if  ((b >= c && c >= a) || (b >= a && a >= c)) {
                System.out.println(b);
                }
            //((c >= a && a >= b) || (c >= b && b >= a)) 2
            else {
                System.out.println(c);
            }
        }
        else if ((a % 2 == 0) && (b % 2 == 0))  {
            if (a > b) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
        else if ((a % 2 == 0) && (c % 2 == 0)) {
            if (a > c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else if ((b % 2 == 0) && (c % 2 == 0)) {
            if (b > c) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
        else if (a % 2 == 0) {
            System.out.println(a);
        }
        else if (b % 2 == 0) {
            System.out.println(b);
        }
        else if (c % 2 == 0) {
            System.out.println(c);
        }
        else {
            System.out.println("Чётных чисел нет");
        }
    }
}
