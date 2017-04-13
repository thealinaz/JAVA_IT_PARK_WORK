//Посчитать произведение простых чисел в последовательности (пока не -1)
import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sequence:");

		int n = scanner.nextInt();
		int p = 1;
		boolean flag1 = false;   //for check, when no prime numbers in the sequence

		while (n != -1) {
			boolean flag = true;

			for (int i = 2; i*i <= n; i++) {
				if (n % i == 0) {
						flag = false;
						break;
					}
			}

			if (n <= 0) flag = false; 
			if (n == 1) flag1 = true;
			if (flag) p *= n;
			n = scanner.nextInt();
		}

		if (p != 1) System.out.println("Product of prime numbers = " + p);
		else {
			if (flag1) System.out.println("Product of prime numbers = " + p);
			else System.out.println("No prime numbers in the sequence");
		} 
	}
}
