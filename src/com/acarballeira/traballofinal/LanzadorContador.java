package com.acarballeira.traballofinal;

import java.io.*;
import java.util.ArrayList;

public class LanzadorContador {

    private static String ERROR = "error_contador.txt";
    private static String SALIDA = "salida_contador.txt";
    private static String CLASE = "com.acarballeira.traballofinal.ContadorLetra";
    private static ArrayList<Process> listaProcesos;
    private static String fichero;
    private static String classpath;
    private static String[] letras;

    private static void crearProcesos() throws IOException {

        listaProcesos = new ArrayList<>();
        for (String letra : letras){
            ProcessBuilder pb = new ProcessBuilder();
            pb.command(new String[]{"java", "-cp", classpath, CLASE, fichero, letra});
            pb.redirectError(new File(letra + "_" + ERROR));
            pb.redirectOutput(new File(letra + "_" + SALIDA));
            Process p = pb.start();
            listaProcesos.add(p);
        }
    }

    private static void recogerDatos() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(SALIDA)));
        for (String letra : letras){
            BufferedReader br = new BufferedReader(new FileReader(letra + "_" + SALIDA));
            String result = br.readLine();
            System.out.println(letra + ": " + result);
            bw.write(letra + ": " +result);
            bw.newLine();
        }
        bw.close();
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException, InterruptedException {

        fichero = args[0];
        classpath = args[1];
        letras = args[2].split(",");

        crearProcesos();

        for (Process p : listaProcesos){
            p.waitFor();
        }

        recogerDatos();
    }
}
