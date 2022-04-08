package com.acarballeira.procesos2;

import java.io.*;

public class Ejercicio9Padre {
    /*
    Escribir un simple programa que produzca números aleatorios, recibiendo para ello 3
    parámetros, la cantidad de números a generar, el valor mínimo y el máximo de los
    números generados.

    Escribir otro programa que reciba primero la cantidad de números que va a procesar, y a
    continuación una lista de números, uno por línea, y los ordene.

    Por último, crearemos otro programa que emplee nuestras dos utilidades, arrancando los
    mismos como procesos. Nuestro programa nos preguntará el valor mínimo, el máximo y
    cuantos números queremos generar y utilizará los procesos para obtener un fichero con los
    números generados, y ordenados.
     */
    private static final String CLASSPATH = "./out/production/programacion_multiproceso";
    private static String ERROR_HIJO_ALEATORIO = "error_Ejercicio9HijoAleatorio.txt";
    private static String ERROR_HIJO_ORDENACION = "error_Ejercicio9HijoOrdenacion.txt";
    private static String SALIDA = "salida_ejercicio_9.txt";
    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));


    private static String pideNumero ( String mensaje ) throws IOException {
        System.out.print( mensaje );
        return teclado.readLine();
    }

    private static String pideNumeroValido ( String mensaje ) throws IOException {
        String num;
        do{
            num = pideNumero(mensaje);
        } while(!num.matches("^[0-9]+"));
        return num;
    }

    public static void main(String[] args) throws IOException {
        String min = pideNumeroValido("Introduce el valor mínimo");
        String max = pideNumeroValido("Introduce el valor máximo");
        String q = pideNumeroValido("Cuántos números quieres generar?");

        ProcessBuilder pbHijoAleatorio = new ProcessBuilder();
        pbHijoAleatorio.command(new String[]{"java", "-cp", CLASSPATH, "com.acarballeira.procesos2.Ejercicio9HijoAleatorio", q, min, max});
        pbHijoAleatorio.redirectError(new File(ERROR_HIJO_ALEATORIO));

        ProcessBuilder pbHijoOrdenacion = new ProcessBuilder();
        pbHijoOrdenacion.command(new String[]{"java", "-cp", CLASSPATH, "com.acarballeira.procesos2.Ejercicio9HijoOrdenacion", q});
        pbHijoOrdenacion.redirectError(new File(ERROR_HIJO_ORDENACION));
        pbHijoOrdenacion.redirectOutput(new File(SALIDA));

        Process pAleatorio = pbHijoAleatorio.start();
        Process pOrdenacion = pbHijoOrdenacion.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(pAleatorio.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(pOrdenacion.getOutputStream()));
        String s;
        while((s = br.readLine()) != null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
