package com.ebouprime;


import static com.ebouprime.utiles.Print.printGreen;
import static com.ebouprime.utiles.Print.print;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            print("Hallo");
            printGreen(i);
        }
    }
}