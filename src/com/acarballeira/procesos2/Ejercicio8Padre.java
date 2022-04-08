package com.acarballeira.procesos2;

import java.io.*;

public class Ejercicio8Padre {
    /*
    Escribir un simple programa que reciba líneas de texto de su entrada estándar, devolviendo
    para cada línea de entrada, el mismo texto, convertido en mayúsculas.
    Escribir a continuación otro programa que utilice nuestro conversor a mayúsculas como un
    proceso, leyendo líneas de texto por consola, y pasando dichas líneas a la entrada del
    proceso para que sean convertidas. La ejecución terminará cuando escribamos una entrada
    con el texto “fin”.
     */
    private static final String CLASSPATH = "./out/production/programacion_multiproceso";
    private static String ERROR = "errores_ejercicio8.txt";

    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(new String[]{"java", "-cp", CLASSPATH, "com.acarballeira.procesos2.Ejercicio8Hijo"});
        pb.redirectError(new File(ERROR));
        //pb.redirectOutput(ProcessBuilder.Redirect.INHERIT); //Redirixe a saída do proceso á saída deste proceso. Evitamos así ter que facer o Buf do inputstream
        Process pHijo = pb.start();
        
        BufferedReader brPadre = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bwHijo = new BufferedWriter(new OutputStreamWriter(pHijo.getOutputStream()));
        String entrada;
        while(!(entrada = brPadre.readLine()).equalsIgnoreCase("fin")){
            bwHijo.write(entrada);
            bwHijo.newLine();            
        }
        bwHijo.write("fin");        
        bwHijo.close();
        
        BufferedReader brHijo = new BufferedReader((new InputStreamReader(pHijo.getInputStream())));
        while((entrada = brHijo.readLine()) != null){            
            System.out.println(entrada);
        }
    }
}
