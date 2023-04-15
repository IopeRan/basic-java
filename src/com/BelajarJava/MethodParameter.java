package com.BelajarJava;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Erlang", "Andriyanputra");
        sayHello("Andriyanputra", "Erlang");
    }
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello" + firstName + "" + lastName);
    }
}
