//Оптимизировать вычисление ряда Фибоначии
import java.util.Scanner;

public class Program {
	public static int findFib(int n){
		int s[] = new int[n];
		s[0] = 1;
		s[1] = 1;
		for (int i = 2; i < n; i++)
			s[i] = s[i-1] + s[i-2];
		return s[n-1];
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of Fibonacci element:");
		int n = in.nextInt();

		if (n > 1) n = findFib(n);
		else n = 1;
		System.out.println("Fibonacci number = " + n);
	}
}