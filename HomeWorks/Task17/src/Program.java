import java.util.Scanner;

public class Program {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of humans: ");
        int n = in.nextInt();
        Human[] human =  new Human[n];
        String name;
        int age;
        System.out.println("Enter names and ages of humans: ");

        for (int i = 0; i < human.length; i++) {
            name = in.nextLine();
            human[i].setName(name); //вот че ему не нравится?!!???????"?7!?!?!?!?!? =((((((((((((((99(9 бесиТтТТ
            age = in.nextInt();
            human[i].setAge(age);
        }

        //human[].sortBubble; //хз как это делается(

        for (int i = 0; i < human.length; i++) {
            System.out.println(human[i]);
        }

    }
}
