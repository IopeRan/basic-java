package com.BelajarJava;

public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer Number
        byte iniByte = 100; // byte bisa menampung minimal -128 sampai maksimal 127 dengan size 1 byte
        short iniShort = 1000; //  short bisa menampung minimal -32,768 sampai maksimal 32,768 dengan size 2 bytes
        int iniInt = 10000000; // int bisa menampung minimal -2,147,483,648  sampai maksimal 2,147,483,647 dengan size 4 bytes
        long iniLong = 1000000000; // long bisa menampung minimal -9,223,372,036,854,775,808 sampai maksimal  9,223,372,036,854,775,807 dengan size 8 bytes
        long iniLong2 = 1000000000L; // long namun diakhiri dengan huruf L dipaling akhir untuk menandakan itu adalah long
        // default variabel diatas adalah 0

        // Floating Point Number 
        float iniFloat = 10.10F; // float bisa menampung minimal 3.4e-038 sampai maksimal 3.4e+038 dengan size 4 bytes dan bisa ditambahkan huruf F atau f dipaling akhir untuk menandakan ini adalah float
        double iniDouble = 10.10; // double bisa menampung minimal 1.7e-308 sampai maksimal 1.7e+308 dengan size 8 bytes
        // defaul variabel diatas adalah 0

        // kode: Literals
        // decimal
        // hexa
        // binary
        int decimalInt = 25; // langsung memasukkan seperti biasa atau nilai desimal nya saja
        int hexInt = 0xA132B; // di awali dari 0x didepannya lalu dilanjut dengan pecahan hexa desimalnya
        int binInt = 0b01010101; // di awali dari 0b lalu dilanjut dengan nilai binary nya

        // kode: Underscore
        // balance
        // sum
        int amount = 1_000_000_000; // untuk mempermudah membaca angka

         // Kode: Konversi Tipe Data Number
         // Widening Casting(otomatis) byte => short => int => long => float => double
         byte iniByte1 = 10;
         short iniShort2 = iniByte1;
         int iniInt1 = iniShort2;

         // Narrowing Casting(manual) doble => float => long => int => short => byte
         int iniInt3 = 1000;
         byte iniByte3 = (byte) iniInt3;
    }
}
