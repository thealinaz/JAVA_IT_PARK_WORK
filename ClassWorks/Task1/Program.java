import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int a [] = new int[n];
        int y = 0, x = 0;
        System.out.println("Enter elements of array: ");

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int min = a[0], max = a[0];

        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
            	min = a[i];
            	y=i;
            }
            if (max < a[i]) {
            	max = a[i];
            	x=i;
            }
        }
        a[y] = max;
        a[x] = min;
		
		System.out.println("New array: ");
        for (int i = 0; i < n; i++) 
            System.out.print(a[i] + " ");
	}
}