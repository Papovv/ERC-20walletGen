
import java.util.Scanner;

public class ethWallGen {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите число кошельков");
    int a = scan.nextInt();
    int b = 1 + a;
    System.out.println("кошельков сгенерировано " + b);
    
  }
}
