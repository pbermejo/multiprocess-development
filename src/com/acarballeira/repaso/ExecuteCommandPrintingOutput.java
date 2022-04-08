package com.acarballeira.repaso;

import java.io.*;
import java.nio.Buffer;

public class ExecuteCommandPrintingOutput {
    private static Process executeCommand() throws IOException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(new String[]{"ls"});
        return pb.start();
    }

    private static void printProcessOutput(InputStream stream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        String output;
        while((output = br.readLine()) != null){
            System.out.println(output);
        }
    }

    public static void main(String[] args) throws IOException {
        Process p = executeCommand();
        printProcessOutput(p.getInputStream());
        printProcessOutput(p.getErrorStream());
    }
}
