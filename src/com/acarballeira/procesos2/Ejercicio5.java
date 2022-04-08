package com.acarballeira.procesos2;

import java.io.File;
import java.io.IOException;

public class Ejercicio5 {
    /*
    Escribe un programa que ejecute un .bat y redirija la salida a un fichero de texto y los
    errores también. El contenido del .bat es el siguiente:
        echo inicio comandos
        md cartafol
        cd cartafol
        dir
        dirr
        tree /F > fich.txt
     */
    private static String LOTES = "muestra_ficheros.bat";
    private static String SALIDA = "salida_fichero_bat.txt";
    private static String ERROR = "errores_fichero_bat.txt";

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder(LOTES);
        pb.redirectOutput(new File(SALIDA));
        pb.redirectError(new File(ERROR));
        pb.start();
    }
}
