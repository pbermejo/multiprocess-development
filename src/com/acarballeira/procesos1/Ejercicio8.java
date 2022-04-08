package com.acarballeira.procesos1;

import java.io.IOException;

public class Ejercicio8 {

    /*
    Escribir un programa que cree un nuevo proceso, espere hasta la finalización del mismo, y
una vez finalizado el proceso hijo, muestre el valor con el que ha finalizado dicho proceso.
     */

    public static void main(String[] args) throws IOException, InterruptedException {

        Process p = new ProcessBuilder("notepad").start();
        System.out.println(p.waitFor());
    }
}
