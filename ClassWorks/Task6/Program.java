public class Program {

	public static int[] merge(int a[], int b[]) {

		int c[] = new int[a.length + b.length];
		int n = 0;
		int m = 0;
		for (int i = 0; i < (a.length + b.length); i++)
			if (a[n] < b[m]) {
				c[i] = a[n];
				n++;
			} else {
				c[i] = b[m];
				m++;
			}
		return c;
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 4};
		int b[] = {3, 5, 6};
		int res[] = new int[a.length + b.length];
		res = merge(a,b);

		for (int i = 0; i < a.length + b.length; i++)
		System.out.println (res[i]);
	}
}