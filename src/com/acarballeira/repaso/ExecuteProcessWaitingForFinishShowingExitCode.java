package com.acarballeira.repaso;

import java.io.File;
import java.io.IOException;

public class ExecuteProcessWaitingForFinishShowingExitCode {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(new String[]{"ls", "-la"});
        pb.directory(new File("/"));
//        pb.redirectError(new File("error.txt"));
//        pb.redirectOutput(new File("output.txt"));
        Process p = pb.start();
        System.out.println(p.waitFor());
    }
}
