package com.acarballeira.procesos2;

import java.io.*;

public class Ejercicio2 {

    /*
    Escribir un programa que cambie la fecha del sistema utilizando el comando date y
pasando la nueva fecha desde nuestro programa a su entrada estándar.
     */
    private static final String ERROR = "errores_ejercicio2.txt";

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "DATE");
        pb.redirectError(new File(ERROR));
        Process p = pb.start();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
        bw.write("28-05-1981");
        bw.flush();
        bw.close();
    }
}
