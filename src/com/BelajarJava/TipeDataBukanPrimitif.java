package com.BelajarJava;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // Tipe Data Bukan Primitif
        // Representasi Tipe Data Primitif
        // left = Tipe Data Primitif | right = Tipe Data Bukan Primitif
        // byte = Byte
        // short = Short
        // int = Integer
        // long = Long
        // double = Double
        // boolean = Boolean
        // character = Character

        // memiliki cara kerja yang sama dengan tipe data primitif

        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        // Byte iniByte; // error karna tidak ada inialisasi value

        Byte iniByte; // work karna ada inialisasi value
        iniByte = null;

        Short iniShort; // null value default
        iniShort = 100;

        // Konversi tipe data Primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        long iniLong2 = iniObject.longValue();
        short iniShort2 = iniObject.shortValue();

        Long amount = 1000000L;
        long iniObject2 = amount;
        

    }
}
