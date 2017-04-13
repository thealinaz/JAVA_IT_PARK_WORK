//Посчитать сумму чисел, порядок вхождения которых - четное число
import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sequence:");

		int n = scanner.nextInt();
		int s = 0;

		while (n != -1) {
			n = scanner.nextInt();
			if (n != -1) s += n;
			else break; 
			n = scanner.nextInt();
		}
		System.out.println("Sum of numbers = " + s);
	}
}
