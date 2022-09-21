import java.util.Scanner;

public class Method_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        // int sum = 0;  присваивает переменной стартовое значение
        System.out.println(sum); // выводит стартовое значение
        //sum = countSumm(sum); // запускает функцию и присваивает полученное значение нашей переменной
        //sum = countSumm(sum); // обновляет значение переменной через функцию (через возвращенное значение)

        while (sum != 100) {
            sum = countSumm(sum);
            //countSumm(sum);
        }

    }
    public static int countSumm(int sum) { //название функции countSumm и тип данных int
        sum = sum + 2; //берет переменную и добавляет к ней два
        System.out.println(sum); //выводит переменную
        return sum; //возвращает новое значение переменной

    }
}
