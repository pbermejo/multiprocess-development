package com.acarballeira.procesos1;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ejercicio4 {

    /*
    Escribir un programa que abra un fichero, empleando para ello la aplicación por defecto
para trabajar con dicho tipo de fichero.
     */
    private static final String RUTA = "C:/Users/DUAL202/Desktop/archivo.docx";

    public static void main(String[] args) throws IOException {
        File f = new File(RUTA);
        Desktop desktop = Desktop.getDesktop();
        desktop.open(f);
    }
}
