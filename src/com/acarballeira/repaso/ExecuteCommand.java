package com.acarballeira.repaso;

import java.io.File;
import java.io.IOException;

public class ExecuteCommand {
    private static String[] COMMAND = {"cmd", "/C", "start", "dir", "/W"};

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder().command(COMMAND);
        pb.directory(new File("C:/"));
        pb.start();
    }
}
