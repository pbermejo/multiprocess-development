package com.acarballeira.traballofinal;

import java.io.*;

public class ContadorLetra {

    private static int contarOcurrencias(String fichero, String letra) throws IOException {
        String linea;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File( fichero ))));

        while((linea = br.readLine()) != null){
            String caracteres[] = linea.split("");
            for(int i=0; i<caracteres.length; i++){
                if(letra.equalsIgnoreCase(caracteres[i])){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException {
        String fichero = args[0];
        String letra = args[1];

        int count = contarOcurrencias(fichero, letra);
        System.out.println(count);
        System.out.flush();
    }
}
