package com.acarballeira.procesos1;

import java.io.IOException;

public class Ejercicio1 {

    /*
    Escribir un programa que abra el bloc de notas de Windows.
     */

    public static void main(String[] args) throws IOException {
        new ProcessBuilder().command(new String[] {"notepad.exe"}).start();

        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        pb.start();

        ProcessBuilder pb2 = new ProcessBuilder();
        pb2.command(new String[] {"notepad.exe"}).start();
    }
}
