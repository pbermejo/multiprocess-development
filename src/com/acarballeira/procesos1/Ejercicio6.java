package com.acarballeira.procesos1;

import java.io.File;
import java.io.IOException;

public class Ejercicio6 {

    /*
    Escribir un programa que ejecute el comando “dir /w”, sobre la raíz del disco C

    java Ejercicio6
    --> proceso pb (cmd) /C
    ------> dir  /W



     */

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder(new String[] {"cmd", "/C", "start", "dir", "/W"});
        pb.directory(new File("C:/"));
        pb.start();


        new ProcessBuilder(new String[] {"cmd", "/C", "start", "dir", "/W", "C:/"}).start();

    }
}