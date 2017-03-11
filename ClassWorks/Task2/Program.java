import java.util.Scanner;

class Program {
  public static int sum (int a, int b) {int s = 0;
    for (int i = a; i <= b; i++)
      s += i;
    return s;
    }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter x, y: ");
    
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int c = sum (x, y);

    System.out.println("Sum of" + c);
    }
} 