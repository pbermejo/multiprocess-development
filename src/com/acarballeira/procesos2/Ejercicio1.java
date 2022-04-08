package com.acarballeira.procesos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio1 {

	/*
	Escribir un programa que obtenga y muestre el listado de archivos y directorios de la
ubicación actual del programa.
	 */

	public static String readStream(InputStream stream) throws IOException {
		String linea;
		BufferedReader bre = new BufferedReader(new InputStreamReader(stream));
		while((linea = bre.readLine()) != null) {
			System.out.println(linea);
		}
		bre.close();
		return linea;
	}

	public static void main(String[] args) throws IOException {

		Process p = new ProcessBuilder("cmd", "/C", "DIR").start();

		readStream(p.getInputStream());
		readStream(p.getErrorStream());

		/*
		También se puede hacer con:

		InputStream is = p.getInputStream();
        while((c = is.read()) != -1){
            System.out.println((char)c);
        }
		 */

		try {
			System.out.printf("\nEl subproceso finalizó con código %s\n", p.waitFor());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
