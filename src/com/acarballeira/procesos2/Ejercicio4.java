package com.acarballeira.procesos2;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {

    /*
    Escribir un programa que ejecute el comando driverquery y almacene el resultado en un
fichero de texto, redirigiendo la salida estándar del comando.
     */
    private static String SALIDA = "salida_driverquery.txt";
    private static String ERROR = "errores_driverquery.txt";

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("driverquery");
        pb.redirectOutput(new File(SALIDA));
        pb.redirectError(new File(ERROR));
        pb.start();
    }
}
