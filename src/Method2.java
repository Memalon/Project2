import java.util.Scanner;

public class Method2 {
    //Напечатать пирамиду из 5-к
    //5
    //5 5
    //5 5 5
    //5 5 5 5
    //5 5 5 5 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String five = sc.nextLine(); //вводим число в переменную
        String x = " " + five; // дублируем его для прибавления

        System.out.println(five); // выводим первую строку

        five = print5(five,x); // юзаем созданную функцию
        five = print5(five,x);
        five = print5(five,x);
        print5(five,x);
    }

    public static String print5(String str, String x) { //
        System.out.println(str + x);
        return str + x;

    }
}
