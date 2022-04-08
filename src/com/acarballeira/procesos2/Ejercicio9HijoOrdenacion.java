package com.acarballeira.procesos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9HijoOrdenacion {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NumberFormatException, IOException {
        int q;
        String s;
        ArrayList<Integer> numeros = new ArrayList<>();
        
        q = Integer.parseInt(args[0]);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((s = br.readLine()) != null){
            numeros.add(Integer.parseInt(s.strip()));
        }
        br.close();
        Collections.sort(numeros);
        for (Integer n : numeros){
            System.out.println(n);
        }
    }
}
