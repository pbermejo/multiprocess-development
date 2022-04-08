package com.acarballeira.repaso;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OpenFileWithDefaultApp {
    private static String FILE = "/home/pbermejo/DAM_Dual/PSP/UD1/ejercicios/10. java_exercicios_basicos_1.pdf";

    public static void main(String[] args) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File(FILE));
    }
}
