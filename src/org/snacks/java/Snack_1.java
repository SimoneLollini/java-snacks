package org.snacks.java;

import java.util.Scanner;

public class Snack_1 {
//    Snack 1
//    Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.close();
        System.out.print("Inserisci un numero: ");
        int number = scan.nextInt();

        System.out.println(number % 2 == 0 ? number : number + 1 );

    }
}
