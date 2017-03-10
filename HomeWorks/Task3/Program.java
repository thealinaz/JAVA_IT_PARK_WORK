import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sequence:");

		int n = scanner.nextInt();
		int p = 1;
		boolean flag1 = false;   //for check, when no prime numbers in the sequence

		while (n != -1) {
			int s = 0;
			int m = n;
			boolean flag = true;
			if (n == 1) flag1 = true;
			if (n == 0) flag = false;

			if (n < 0) n *= -1;
			while (n!=0) {
				s = n % 10;
				n /= 10;
			}

			for (int i = 2; i*i <= s; i++) {
				if (s % i == 0) {
					flag = false;
					break;
				}
			}
			
			if (flag) p *= m;
			n = scanner.nextInt();
		}

		if (p != 1) System.out.println("Product of certain numbers = " + p);
		else {
			if (flag1) System.out.println("Product of certain numbers = " + p);
			else System.out.println("No certain numbers in the sequence");
		} 
	}
}