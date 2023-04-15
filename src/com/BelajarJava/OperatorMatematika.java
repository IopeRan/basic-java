package com.BelajarJava;

public class OperatorMatematika {
    public static void main(String[] args) {
        // operator matematika
        int valueA = 100;
        int valueB = 10;

        System.out.println(valueA + valueB);
        System.out.println(valueA - valueB);
        System.out.println(valueA * valueB);
        System.out.println(valueA / valueB);
        System.out.println(valueA % valueB);

        // augmented assignment
        int valueC = 100;

        valueC += 10;
        System.out.println(valueC);

        valueC -= 10;
        System.out.println(valueC);

        valueC *= 10;
        System.out.println(valueC);

        valueC /= 10;
        System.out.println(valueC);

        valueC %= 10;
        System.out.println(valueC);

        // unary operator
        // ditempatkan didepan variabel dan tidak membutuhkan 2 variabel
        int valueD = 100;

        ++valueD;
        System.out.println(valueD);

        valueD--;
        System.out.println(valueD);

    }
}
