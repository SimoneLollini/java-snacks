package org.snacks.java;

public class Snack_2 {
//    Snack 2
//    Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare
//    a video una falsa lista di invitati con nome e cognome.

    public static void main(String[] args) {

        String[] names = {"Simone", "Alessio", "Rodrigo", "Francesco"};
        String[] lastnames = {"Lollini", "Dolce", "Fantecchi", "Elia"};

        for (int i = 0; i < 10; i++) {
            int randomName = (int)(Math.random() * names.length);  // 0 to 10
            int randomLastname = (int)(Math.random() * lastnames.length);  // 0 to 10
            System.out.println( "Invitato n " + (i+1) + ": " + names[randomName] + " " + lastnames[randomLastname]);
        }
    }
}
