package org.snacks.java;

public class Snack_4 {
//    Snack 4 (Bonus)
//    Crea due array che hanno un numero di elementi diversi.
//    Mostra a video dei nuovi elementi random
//    finchè il numero di elementi presenti nell’array che ne ha di meno + quelli mostrati a video non è uguale
//    al numero di elementi presenti nell’array che ne ha di più

    public static void main(String[] args) {
        String[] firstArray = { "firstArr-1","firstArr-2","firstArr-3","firstArr-4","firstArr-5","firstArr-6","firstArr-7","firstArr-8","firstArr-9","firstArr-10" };
        String[] secondArray = { "secondArr-1","secondArr-2","secondArr-3","secondArr-4","secondArr-5" };

       int maxLoop = firstArray.length + secondArray.length;



        for (int i = 0; i < maxLoop && (i + secondArray.length < firstArray.length); i++) {
            int randomFirstEl = (int)(Math.random() * firstArray.length);  // 0 to 10
            int randomSecondEl = (int)(Math.random() * secondArray.length);  // 0 to 5

            System.out.println( "Elemento n " + (i+1) + ": " + firstArray[randomFirstEl] + " " + secondArray[randomSecondEl]);
        }

    }
}
