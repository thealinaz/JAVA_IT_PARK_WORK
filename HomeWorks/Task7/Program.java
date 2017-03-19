//Найти количество локальных максимумов в массиве
import java.util.Scanner;

class Program {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of array: ");

		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();

		int localmax = 0;

		for (int i = 0; i < n-2; i++)
			if (a[i] < a[i+1] && a[i+1] > a[i+2]) localmax ++;

		System.out.println("Number of local maximums = " + localmax);
	}
}