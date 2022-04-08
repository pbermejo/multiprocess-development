package com.acarballeira.procesos1;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ejercicio5 {

    /*
    Escribir un programa que utilice el libreoffice writer para abrir un archivo que tengas en el
escritorio.
     */

    private static final String RUTA = "C:/Users/DUAL202/Desktop/archivo.docx";

    public static void main(String[] args) throws IOException {
        new ProcessBuilder().command(new String[] {"C:/Program Files/LibreOffice/program/swriter.exe", RUTA}).start();
    }
}
