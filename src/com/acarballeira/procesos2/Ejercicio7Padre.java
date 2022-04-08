package com.acarballeira.procesos2;

import java.io.File;
import java.io.IOException;

public class Ejercicio7Padre {

    /*
    Realiza un programa en Java que admita argumentos desde main() e devolva con
    System.exit(), os seguintes valores:
        a) Se o número de argumentos é < 1 debe devolver 1.
        b) Se o argumento é un número enteiro menor que 0 debe devolver 3.
        c) Se o argumento é unha cadea sen números debe devolver 2.
        d) En calquera outra situación debe devolver 0.
    Realiza un segundo programa Java que execute o anterior. Este segundo programa
    deberá amosar en pantalla o que pasa dependendo do valor devolto ao executar o
    programa anterior.
    Proba os programas dende Eclipse. A continuación, crea un cartafol no disco duro e
    almacena os dous programas. Realiza os cambios precisos para compilalos e executalos
    dende a liña de comandos de DOS.
     */

    private static final String CLASSPATH = "./out/production/programacion_multiproceso";
    private static String ERROR = "errores_ejercicio7.txt";

    private void crearProceso(String[] command) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(command);
        pb.redirectError(new File(ERROR));
        Process p = pb.start();

        System.out.println(p.waitFor());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Ejercicio7Padre ejercicio = new Ejercicio7Padre();
        String classpath = CLASSPATH;
        if(args.length > 0){
            classpath = args[0];
        }
        /**
         * Prueba de diferentes opciones
         */
        ejercicio.crearProceso(new String[]{"java", "-cp", classpath, "com.acarballeira.procesos2.Ejercicio7Hijo.class"});
        ejercicio.crearProceso(new String[]{"java", "-cp", classpath, "com.acarballeira.procesos2.Ejercicio7Hijo", ""});
        ejercicio.crearProceso(new String[]{"java", "-cp", classpath, "com.acarballeira.procesos2.Ejercicio7Hijo", "-1"});
        ejercicio.crearProceso(new String[]{"java", "-cp", classpath, "com.acarballeira.procesos2.Ejercicio7Hijo", "1"});
        ejercicio.crearProceso(new String[]{"java", "-cp", classpath, "com.acarballeira.procesos2.Ejercicio7Hijo", "Hello"});
    }
}
