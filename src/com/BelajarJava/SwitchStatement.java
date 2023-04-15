package com.BelajarJava;

public class SwitchStatement {
    public static void main(String[] args) {
        // Switch Statement
        // memberhentikan program ketika mendapatkan value yang sesuai
        var nilai = "A";

        switch(nilai) {
            case "A":
            System.out.println("Wow, Anda Lulus Dengan Baik");
            break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
                case "D":
                System.out.println("Anda Tidak Lulus");
                break;
                default:
                System.out.println("Mungkin Anda Salah Jurusan");
        } 

        // Switch Lambda
        String ucapan;

        switch(nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        
        // Yield
        // ucapan = switch (nilai) {
        //     case "A":
        //         yield "Wow, Anda Lulus Dengan Baik";
        //     case "B", "C":
        //         yield "Nilai Anda Cukup Baik";
        //     case "D":
        //         yield "Anda Tidak Lulus";
        //     default:
        //         yield "Mungkin Anda Salah Jurusan";
        // }

        // System.out.println($ucapan);

    }
}
