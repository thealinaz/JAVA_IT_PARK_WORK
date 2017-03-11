import java.util.Scanner;

class Program {

  public static void puz (int a[]) {
    for (int i = a.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (a[j] > a[j+1]) {
          int c = a[j+1];
          a[j+1] = a[j];
          a[j] = c;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter size of array: ");
    int n = scanner.nextInt();

    int a [] = new int[n];
    System.out.println("Enter elements of array: ");

    for (int i = 0; i < n; i++)
      a[i] = scanner.nextInt();

    puz(a);

    System.out.println("Array: ");
    for (int i = 0; i < n; i++)
      System.out.println(a[i]);
  }
} 