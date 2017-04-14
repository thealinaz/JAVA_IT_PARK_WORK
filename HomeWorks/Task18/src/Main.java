import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Enter number of humans:");
        int n = in.nextInt();
        System.out.println("Enter names and ages of humans:");
        Human[] humans = new Human[n];
        int[] ages = new int[121];

        for(int i = 0; i < humans.length; i++) {
            humans[i] = new Human(in.next(), in.nextInt());
        }

        for (int i = 0; i < humans.length; i++){
            ages[humans[i].getAge()] ++;
        }

        for(int i = 0; i < ages.length; i++) {
            if (ages[i] != 0){
                if (ages[i] > 1) {
                    System.out.println(ages[i] + " persons "+i + " years old.");
                } else {
                    System.out.println(ages[i] + " person "+i + " years old.");
                }
            }
        }
    }
}
