//Найти среднее арифметические в матрице в виде функции или процедуры
import java.util.Scanner;

class Program {
	public static double findAverage (int a[][], int n, int m){
		double s = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++){
			s += a[i][j];
			}
		s /= m*n;
		return s;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter size of matrix (n*m): ");
		int n = in.nextInt();
		int m = in.nextInt();
	
		int a[][] = new int[n][m];
		System.out.println("Enter elements of matrix: ");

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++){
			a[i][j] = in.nextInt();
			}

		System.out.println("Arithmetic average number = " + findAverage(a, n, m));
	}
}