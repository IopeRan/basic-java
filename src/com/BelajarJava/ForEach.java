package com.BelajarJava;

public class ForEach {
    public static void main(String[] args) {
        String[] array = {
            "Erlang", "Andriyanputra",
            "X PPLG B", "SMKN 2 Banjarmasin"
        };

        for(var value : array) {
            System.out.println(value);
        }
    }
}
