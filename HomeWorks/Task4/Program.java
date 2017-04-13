//Развернуть массив на месте
import java.util.Scanner;

class Program { 
    public static void main(String[] args) { 
     	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int a [] = new int[n];
        int p;
        System.out.println("Enter elements of array: ");

        for (int i = 0; i < n; i++) 
        	a[i] = scanner.nextInt();
        for (int i = 0; i < n/2; i++) {
        	p = a[n-i-1]; 
        	a[n-i-1] = a[i];
        	a[i] = p; 
        }

        System.out.println("Deployed array: ");
        for (int i = 0; i < n; i++) 
            System.out.print(a[i] + " ");
    }
}
