import java.util.Scanner;

public class Test_t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String text = sc.nextLine();
         String part = sc.nextLine();

         text = text.toUpperCase();
         part = part.toUpperCase();

         System.out.println(text.contains(part));

    }
}
