//Оптимизировать вычисление ряда Фибоначии
import java.util.Scanner;

public class Program {
	public static int findFib(int n) {
		if (n < 3) { 
			return 1;
		} else {
			int a = 1;
			int b = 1;
			for (int i = 3; i < n; i++) { 
				b += a;
				a += b;
			}
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of Fibonacci element:");
		int n = in.nextInt();

		System.out.println("Fibonacci number = " + findFib(n));
	}
}