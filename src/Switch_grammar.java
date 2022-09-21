import java.util.Scanner;

public class Switch_grammar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String reqwest = sc.nextLine();

        switch (reqwest) {
            case "else":
                System.out.println("Это альтернативная конструкция условного оператора");
                break;

            case "if":
                System.out.println("Это условный оператор");
                break;

            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;

            default:
                System.out.println("Раздел в разработке");
        }
    }
}
