import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Figure figures[] = new Figure[5];
        figures[0] = new Triangle("a", 3, 5, 4);
        figures[1] = new Triangle("b", 2, 3, 4);
        figures[2] = new Rectangle("c", 5, 10);
        figures[3] = new Rectangle("d", 2, 9);
        figures[4] = new Square("e", 8);

        FileOutputStream outputStream = new FileOutputStream("output.txt");

        for (int i = 0; i < figures.length; i++) {
            outputStream.write((figures[i].toString() + '\n').getBytes());
        }

        FileInputStream inputStream  = new FileInputStream("output.txt");
        for (int i = 0; i < figures.length; i++) {
            System.out.println(readNextLine(inputStream));
        }
    }

    public static String readNextLine(FileInputStream inputStream)throws Exception{
        String result = "";
        int character = inputStream.read();
        while (character != '\n') {
            result += (char)character;
            character = inputStream.read();
        }
        return result;
    }
}
