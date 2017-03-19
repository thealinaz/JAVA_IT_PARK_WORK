//Написать функцию, возвращающую сумму цифр числа
import java.util.Scanner;

public class Program {
	public static int findSum(int n){
		int sum = 0;
		while (n > 0){
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = in.nextInt();

		if (n < 0) n *= -1;
		n = findSum(n);
		System.out.println("Sum = " + n);
	}
}