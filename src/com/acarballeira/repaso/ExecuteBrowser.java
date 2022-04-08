package com.acarballeira.repaso;

import java.io.IOException;

public class ExecuteBrowser {
    private static String URI = "http://www.cifpacarballeira.gal";

    public static void main(String[] args) throws IOException {
        new ProcessBuilder().command(new String[]{"firefox", URI}).start();
    }
}
