import java.util.Scanner;

class Program { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int a [] = new int[n];
        int p = 1;
        boolean flag = false;   //for check, when no prime numbers in the sequence

        System.out.println("Enter elements of array: ");

        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            if ((i + 1) % 2 == 1 && a[i] % 2 == 0) {
                p *= a[i];
                if (a[i] == 1) flag = true;
            }
        } 
        
        if (p != 1) System.out.println("Product of certain numbers = " + p);
        else {
            if (flag) System.out.println("Product of certain numbers = " + p);
            else System.out.println("No certain numbers in the array");
        }
    }
}