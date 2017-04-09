package com.company;


public class Verificator {

    public static boolean verify(String password){
        if (password.length() > 6) {
            return true;
        } else{
            throw new ArithmeticException("Password must be longer than 6 symbols!");
        }
    }
}
