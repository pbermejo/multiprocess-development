package com.acarballeira.procesos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8Hijo {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String entrada;
        while(!(entrada = br.readLine()).equalsIgnoreCase("fin")){
            String salida = entrada.toUpperCase();
            System.out.println(salida);
            System.out.flush();
        }
        br.close();
    }
}
