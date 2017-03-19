//Найти минимальный элемент в каждой строке матрицы в виде функции или процедуры
import java.util.Scanner;

public class Program {
	public static int[] findMinimum (int a[][], int n, int m){
		int min[] = new int[n];

		for (int i = 0; i < n; i++){
			min[i] = a[i][0];

			for (int j = 0; j < m; j++)
				if (a[i][j] < min[i]) min[i] = a[i][j];
		}
		return min;
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

		int min[] = findMinimum(a, n, m);

		for (int i = 0; i < n; i++)
			System.out.println("Minimal element in " + (i+1) + " line = " + min[i]);
	}
}