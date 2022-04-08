package com.acarballeira.procesos1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Ejercicio7 {

    /*
    Escribir un programa que abra un proceso, y que espere o 10 segundos o a que el proceso
hijo termine para finalizar su ejecución.
     */

    public static void main(String[] args) throws IOException, InterruptedException {

        Process p = new ProcessBuilder("notepad").start();
        p.waitFor(10, TimeUnit.SECONDS);
    }
}
