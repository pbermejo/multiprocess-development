package com.acarballeira.repaso;

import java.io.IOException;

public class ExecuteBinaryFromPath {
    public static void main(String[] args) {
        try {
            String pathToBinary = args[0];
            new ProcessBuilder().command(pathToBinary).start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
