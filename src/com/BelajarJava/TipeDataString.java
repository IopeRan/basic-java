package com.BelajarJava;

public class TipeDataString {
    public static void main(String[] args) {
        // String
        // String not string
        // menggunakan petik dua ""
        // nilai default null

        String firstName = "Erlang";
        String lastName = "Andriyanputra";

        // print variabel char dengan line(ln)
        System.out.println(firstName);
        System.out.println(lastName);
        // hasil :
        // Erlang
        // Andriyanputra
        
        // print variabel char tanpa line(ln)
        System.out.print(firstName);
        System.out.print(lastName);
        // hasil :
        // Erlang Andriyanputra

        
        // Kode: Menggabungkan String
        String fullName = firstName + lastName;
        System.out.println(fullName);

    }
}
