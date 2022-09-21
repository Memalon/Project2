import java.util.Scanner;

// Дано целое число. Определить четно оно или нечетное. Отдельно вывести сообщение если чисто равно нулю.

public class Else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");

        int x = sc.nextInt();

        if (x == 0) {
            System.out.printf("Число равно нулю.");
        }

        else if (x % 2 == 0) {
            System.out.printf("Число %d четное \n", x);
        }

        else {
            System.out.printf("Число %d нечетное \n", x);
        }


    }
}
