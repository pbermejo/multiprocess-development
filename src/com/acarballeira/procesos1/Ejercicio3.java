package com.acarballeira.procesos1;

import java.io.IOException;

public class Ejercicio3 {

    /*
    Escribir un programa que abra la web del CIFP A Carballeira
(http://www.cifpacarballeira.gal), utilizando un navegador instalado.
     */

    public static void main(String[] args) throws IOException {
        //new ProcessBuilder().command(new String[] {"rundll32", "url.dll,FileProtocolHandler", "http://www.cifpacarballeira.gal"}).start();


        new ProcessBuilder().command(new String[] {"firefox", "http://www.cifpacarballeira.gal"}).start();
    }
}
