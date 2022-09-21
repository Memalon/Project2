import java.util.Scanner;

public class Umno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Step(x));

    }

    public static int Step(int x) {
        x = x * x;
        return x;
    }
}
