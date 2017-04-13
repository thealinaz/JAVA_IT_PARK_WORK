//Сумма элементов массива
import java.util.Scanner;

class Program { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int a [] = new int[n];
        int s = 0;
        System.out.println("Enter elements of array: ");

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            s += a[i];
        }
        
        System.out.println("Sum = " + s);
    }
}
