package org.snacks.java;

public class Snack_3 {
//    Snack 3
//    Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    public static void main(String[] args) {
        int numbers[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(i % 2 != 0){
            sum += numbers[i];
            }
        }
        System.out.println(sum);

    }
}
