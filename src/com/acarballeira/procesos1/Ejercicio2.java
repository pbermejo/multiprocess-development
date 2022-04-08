package com.acarballeira.procesos1;

import java.io.IOException;

public class Ejercicio2 {

    /*
    Escribir un programa que abra una aplicación cualquiera, instalada en el SO, pasando la
ruta completa del ejecutable. Prueba a recogerla de la línea de comandos.

java           Ejercicio2                    C:/programfiles/notepad.exe -readable -toBytes;



javac Ejercicio2.java   ---> Ejercicio2.class

java Ejercicio2.class

     */

    public static void main(String[] args) throws IOException {


        try{

            new ProcessBuilder().command(args).start();

        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("No se ha especificado una ruta válida para ejecutar la aplicación...");
            System.out.println(e.getMessage());
        }
    }
}
