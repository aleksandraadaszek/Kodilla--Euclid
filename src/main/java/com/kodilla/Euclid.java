package com.kodilla;

public class Euclid {
    public static void main (String[] args) {

        int a = 49;
        int b = 28;
        while (a % b != 0){
            int modulo = a % b;
            if(modulo == 0){
                modulo = b;

            }else{
                a = b;
                b = modulo;
            }
        }
        System.out.println("Największy wspólny dzielnik to: " + b);
    }
}




