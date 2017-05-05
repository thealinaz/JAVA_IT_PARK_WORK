import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println(charToInt(in.next()));
    }

    public static int charToInt(String line) {
        char[] symbols = line.toCharArray();
        int number = 0;

        for (int i = 0; i < symbols.length; i++) {
            number = number * 10 + (symbols[i] - '0');
        }
        return number;
    }
}
