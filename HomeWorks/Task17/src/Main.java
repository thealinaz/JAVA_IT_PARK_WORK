//Создать массив людей, сортировать пузырьком по возрасту
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of humans: ");
        int n = in.nextInt();
        Human[] humans =  new Human[n];

        System.out.println("Enter names and ages of humans: ");

        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human(in.next(), in.nextInt());   //почему-то не работал nextLine???
        }

        for (int i = humans.length - 1 ; i >= 0; i--) {
            for (int j = 0; j < i; j++)
                if (humans[j].getAge() > humans[j+1].getAge()){
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
        }
        System.out.println("Sorted humans:");
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }

    }
}
