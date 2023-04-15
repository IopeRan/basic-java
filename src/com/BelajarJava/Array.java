package com.BelajarJava;

public class Array {
    public static void main(String[] args) {
        // deklarasi manual
        String[] stringArray;
        stringArray = new String[3]; // index 3 artinya data yang bisa dicakup adalah 3

        stringArray[0] = "Erlang";
        stringArray[1] = "Andriyanputra";

        // menampikan isi array dengan memanggil nama variabelnya lalu ditambah dengan index data
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        // System.out.print(stringArray[0]);
        // System.out.print(stringArray[1]);
        
        // menimpa isi array atau mengganti isi array
        stringArray[0] = "Andriyanputra";
        stringArray[1] = "Erlang";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        String[] stringArray2 = new String[3]; // array baru

        // Array initializer
        // membuat array dengan cepat

        // cara 1
        String[] namaLengkap = {
            "Erlang", "Andriyanputra"
        };

        String[] namaLengkap2 = {
            "Iden", "Idayre"
        };

        // cara 2
        int[] arrayInt = new int[] {
            1,2,3,4,5,6,7,8,9,10
        };

        // cara 3
        long[] arrayLong = {
            10L,20L,30L,40L,50L
        };

        long[] arrayLong2 = {
            10L,20L,30L,40L,50L
        };

        // operasi di array
        // mencek berapa panjang datanya
        System.out.println(arrayLong.length);
        // hasil : 5 (ada 5 data di dalam arraylong)

        // menghapus data pada array namun lebih tepat nya mengganti jumlah data pada array menjadi 0
        arrayLong2[0] = 0;
        namaLengkap2[0] = null;

        // array di dalam array
        String[][] members  = { // [][] artinya dalam 1 bungkus array hanya bisa menampung maksimak 2 data
            {"Erlang", "Andriyan"},
            {"Andri", "Yan"},
            {"Eran"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
