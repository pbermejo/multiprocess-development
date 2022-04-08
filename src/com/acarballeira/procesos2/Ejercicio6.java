package com.acarballeira.procesos2;

import java.io.*;

public class Ejercicio6 {
    /*
    Escribir un programa que obtenga la lista de procesos en ejecución en nuestro equipo,
empleando para ello el comando tasklist. Como queremos ver nuestra lista de procesos
ordenados alfabéticamente de forma inversa, redirigiremos el resultado al comando sort,
indicando que guarde el resultado en un fichero de texto.
     */
    private static String SALIDA = "salida_sort.txt";

    public static void main(String[] args) throws IOException {
        String linea;
        ProcessBuilder pbTasklist;
        ProcessBuilder pbSort;

        pbTasklist = new ProcessBuilder("CMD", "/C", "tasklist");
        pbSort = new ProcessBuilder("CMD", "/C", "sort", "/r");

        pbSort.redirectOutput(new File(SALIDA));
        Process pTasklist = pbTasklist.start();
        Process pSort = pbSort.start();


        BufferedReader br = new BufferedReader(new InputStreamReader(pTasklist.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(pSort.getOutputStream()));
        while((linea = br.readLine()) != null){
            bw.write(linea + "\n");
        }
        bw.close();
        br.close();
    }
}
