package com.acarballeira.procesos2;

import java.util.Random;

public class Ejercicio9HijoAleatorio {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException {

        int q = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        int max = Integer.parseInt(args[2]);

        Random r = new Random();
        for (int i=0; i < q; i++){
            System.out.println(r.nextInt((max - min) + 1) + min);
        }
    }
}
