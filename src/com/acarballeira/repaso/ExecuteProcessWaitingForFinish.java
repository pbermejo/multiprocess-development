package com.acarballeira.repaso;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExecuteProcessWaitingForFinish {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(new String[]{"cmd", "/C", "start", "dir", "/P"});
        Process p = pb.start();
        p.waitFor(10 , TimeUnit.SECONDS);
    }
}
