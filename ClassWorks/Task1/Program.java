import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        int m = 0;
        boolean flag = false;

        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();

        int a [] = new int[n];
        System.out.println("Enter elements of array: ");

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] == x) {
                m=x;
                flag = true;
            }
        }
		
		if (flag) System.out.println('Position: ' + m);
        else System.out.println(-1);
	}
}