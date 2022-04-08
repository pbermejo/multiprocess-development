package com.acarballeira.procesos2;

public class Ejercicio7Hijo {

    private int procesaParametros(String[] args){
        if (args.length < 1){
            return 1;
        }else if(args[0].toLowerCase().matches("^[a-z]+")){
            return 2;
        }else if(args[0].matches("^-?[0-9]+") && Integer.parseInt(args[0]) < 0){
            return 3;
        }

        return 0;
    }

    public static void main(String[] args) {
        Ejercicio7Hijo ejercicio = new Ejercicio7Hijo();
        System.exit(ejercicio.procesaParametros(args));
    }
}
