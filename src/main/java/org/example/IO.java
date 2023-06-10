package org.example;

import java.util.Scanner;

public class IO {

    private static Scanner scanner = new Scanner(System.in);
    public static void printLn(String string){
        System.out.println(string);
    }
    public static String getInputString(){
        return scanner.nextLine();
    }
    public static int getInputInt(){
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
    public static boolean getInputBool(){
        return scanner.nextBoolean();
    }

}
