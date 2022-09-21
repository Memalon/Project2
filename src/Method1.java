import java.util.Scanner;

public class Method1 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int x = sc.nextInt();
  Year(x);
  if (x == 1) {
   System.out.println("Високосный год");
  }
  else {
   System.out.println("Невисокосный год");
  }

 }
 public static int Year(int i) {
  if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))) {
   return i = 1;
  }
 else
  return i = 0;

 }
}

