//Найти максимальный элемент в каждом столбце матрицы в виде функции или процедуры
import java.util.Scanner;

public class Program {
	public static int[] findMaximum (int a[][], int n, int m){
		int max[] = new int[n];

		for (int i = 0; i < n; i++){
			max[i] = a[0][i];

			for (int j = 0; j < m; j++)
				if (a[j][i] > max[i]) max[i] = a[j][i];
		}
		return max;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter size of matrix (n*m):");
		int n = in.nextInt();
		int m = in.nextInt();

		int a[][] =  new int[n][m];
		System.out.println("Enter elements of matrix: ");

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = in.nextInt();

		int max[] = findMaximum(a, n, m);

		for (int i = 0; i < n; i++)
			System.out.println("Maximal element in " + (i+1) + " colomn = " + max[i]);
	}
}