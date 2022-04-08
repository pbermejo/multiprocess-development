package com.acarballeira.procesos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

    /*
    Lanza un proceso que ejecute un comando que no exista en el sistema. Recoge el error y
muéstralo en la salida del programa.
     */

    public static void main(String[] args) throws IOException {
        Process p = new ProcessBuilder("CMD", "/C", "NOEXISTE").start();
        String linea;

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while((linea = br.readLine()) != null){
            System.out.println(br.readLine());
        }
        
        BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        while((linea = bre.readLine()) != null){
            System.out.println(bre.readLine());
        }
        bre.close();
    }
}
