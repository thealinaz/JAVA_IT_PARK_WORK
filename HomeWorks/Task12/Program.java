//Сделать разворот против часовой стрелки в квадратной матрице в виде функции или процедуры
import java.util.Scanner;

public class Program {
	public static int[][] turnMatrix(int a[][], int n){
		int b[][] = new int[n][n];
		for (int i = 0; i < n; i++){
			int r = 0;
			
			for (int j = 0; j < n; j++){
				b[i][j] = a[r][n-i-1];
				r++;
			}
		}
	return b;
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

		int b[][] = turnMatrix(a, n);
		System.out.println("Turned matrix:");

		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++)
				System.out.printf("%5d ", b[i][j]);
			System.out.println();
		}
	}
}