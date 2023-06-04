package org.example;

import java.util.Scanner;

public class IO {

    private Scanner scanner = new Scanner(System.in);
    public void printLn(String string){
        System.out.println(string);
    }
    public String getInputString(){
        return scanner.nextLine();
    }
    public int getInputInt(){
        return scanner.nextInt();
    }

    public boolean getInputBool(){
        return scanner.nextBoolean();
    }

}
