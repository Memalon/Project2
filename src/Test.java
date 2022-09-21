
//На вход подаётся  целое число.
// Выведите "YES", если введено трёхзначное положительное число,
// а в противном случае - "NO".
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        System.out.println(((numb > 99) && (numb < 1000)) ? "YES" : "NO");

//        if ((numb > 99) && (numb < 1000)) {
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }
    }
}
