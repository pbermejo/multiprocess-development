package com.acarballeira.repaso;

import java.io.IOException;

public class ExecuteNotepad {
    private static String COMMAND = "gedit"; // o notepad.exe en windows

    public static void main(String[] args) throws IOException {
        new ProcessBuilder().command(COMMAND).start();
    }
}
