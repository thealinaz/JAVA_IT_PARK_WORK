//Написать функцию проверки числа на простоту (boolean-функция)
import java.util.Scanner;

public class Program {
	public static boolean findPrimeNumber (int n){
		boolean flag = true;
		for (int i = 2; i*i <= n; i++)
			if (n % i == 0){
				flag = false;
				break;
			}
		return flag;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = in.nextInt();

		if (n < 1) System.out.println("Number " + n + " is not prime");
		else {
			if (findPrimeNumber(n)) System.out.println("Number " + n + " is prime");
			else System.out.println("Number " + n + " is not prime");
		}
	}
}