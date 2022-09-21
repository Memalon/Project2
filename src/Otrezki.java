import java.util.Scanner;
//На числовой прямой даны два отрезка, заданных парами целых чисел: [a1,b1] и [a2,b2]
//Напишите программу, которая находит их пересечение.
//Если пересечение - отрезок, необходимо вывести два числа (границы отрезка),
// если единственная точка - единственное число (точку),
// если пересечения нет - вывести фразу "Пересечения нет" (без кавычек).

public class Otrezki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        if (a1 == b2) {
            System.out.println(a1);
        }
        else if (a2 == b1) {
            System.out.println(a2);
        }
        else if ((b2 < a1) || (b1 < a2)) {
            System.out.println("Пересечения нет");
        }
        else if ((a1 == a2) && (b1 == b2)) {
            System.out.println(a1 + " " + b1);
        }

        else if ((a2 <= a1) && (b1 <= b2)) {
            System.out.println(a1 + " " + b1);
        }

        else if ((a1 <= a2) && (b2 <= b1)) {
            System.out.println(a2 + " " + b2);
        }

        else if ((a2 <= a1) && (b2 <= b1)) {
            System.out.println(a1 + " " + b2);
        }

        else if ((a1 <= a2) && (b1 <= b2)) {
            System.out.println(a2 + " " + b1);
        }


    }
}
