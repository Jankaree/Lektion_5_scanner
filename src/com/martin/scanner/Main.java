package com.martin.scanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    boolean isPlaying = true;

    do{


   int result = scannerNumber();

        if(result >1000) {
            isPlaying = false;
        }else {

            for (int i = 0; i < result; i++) {
                System.out.println(i);
                System.out.println("looping...");
            }
        }


    } while(isPlaying);


    }

    public static String scannerText(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert sentence");
        String input = scanner.nextLine();

        return input;
    }
    public static int scannerNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please inster a number:");


        return scanner.nextInt();
    }
}
