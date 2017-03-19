//Обнулить все элементы главной диагонали квадратной матрицы в виде функции или процедуры
import java.util.Scanner;

public class Program {
	public static int[][] nullifyMainDiag(int a[][], int n){
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (i == j) a[i][j] = 0;
	return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter size of matrix (n*n):");
		int n = in.nextInt();

		int a[][] =  new int[n][n];
		System.out.println("Enter elements of matrix: ");

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = in.nextInt();

		int b[][] = nullifyMainDiag(a, n);
		System.out.println("Matrix with zero main diagonal:");

		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++)
				System.out.printf("%5d ", b[i][j]);
			System.out.println();
		}
	}
}