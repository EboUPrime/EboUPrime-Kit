package com.ebouprime;


import static com.ebouprime.utiles.console.Print.printGreen;
import static com.ebouprime.utiles.console.Print.print;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            print("Hallo");
            printGreen(i);
        }
    }
}