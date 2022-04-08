package com.acarballeira.repaso;

import java.io.IOException;

public class OpenFileWithSpecifiedApp {
    private static String FILE = "/home/pbermejo/DAM_Dual/PSP/UD1/ejercicios/Exercicios_planificacion.docx";
    private static String EXECUTABLE = "/usr/bin/libreoffice";

    public static void main(String[] args) throws IOException {
        new ProcessBuilder().command(new String[]{EXECUTABLE, FILE}).start();
    }
}
