package com.BelajarJava;

public class variable {
    public static void main(String[] args) {
        // Variabel
        // membuat variabel dan mengisikan valuenya secara tidak langsung
        String name;
        name = "Erlang Andriyanputra";

        // membuat variabel dan mengisikan valuenya secara langsung
        int age = 15;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        
        // menimpa data lama dengan data baru 
        name = "Andriyanputra Erlang";
        System.out.println(name);
        // value name akan diganti dari Erlang Andriyanputra menjadi Andriyanputra Erlang
        // karna program java dirunning dari atas ke bawah

        // Kata Kunci Var
        // wajib mengisikan value nya secara langsung
        // var akan mengetahui tipe dengan melihat value nya
        var firstName = "Erlang";
        var lastName = "Andriyanputra";
        var fullName = "Erlang Andriyanputra";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.print(fullName);

        // Kata Kunci final
        // kata kunci final digunakan agar variabel dengan value awal tidak bisa diubah lagi atau ditimpa dengan data yang baru
        final String application = "Belajar Java";
        // application = "Belajar PHP"; // Error // error disebabkan karna mencoba menimpa data pada variabel yang menggunakan kata kunci final
    
    }
}
