import java.util.Random;

class Program{
	public static void main(String[] args) {
		Random random = new Random();
		int ages[] = new int[100];
		int a[] = new int[121];

		for(int i = 0; i < ages.length; i++)
			ages[i] = random.nextInt(120);
		
		for(int i = 0; i < 100; i++) 
			a[ages[i]] ++;

		for(int i = 0; i < 100; i++)
			System.out.println(ages[i]);

		for(int i = 0; i <= 120; i++) {
			if (a[i] != 0) System.out.println("Age " + i + " =" + a[i]);
		}
	}
}