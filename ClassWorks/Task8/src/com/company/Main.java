package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Enter password:");
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        Verificator v = new Verificator();
        if(v.verify(password))
            System.out.println("Your password is verify");
    }
}
