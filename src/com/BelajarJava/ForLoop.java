package com.BelajarJava;

public class ForLoop {
    public static void main(String[] args) {
        //  var counter = 1;
        // perulangan tanpa kondisi atau tanpa henti
        // for(;;) {
        //     // System.out.println("Perulangan Tanpa henti");
        // }

       
        // perulangan dengan kondisi
        // for(; counter <= 10 ;) {
        //     System.out.println("perulangan" + counter);

        //     counter++;
        // }

        // perulangan dengan post statement
        for(var counter = 1; counter <= 10; counter++) {
            System.out.println("perulangan ke" + counter);
        }

    }
}
