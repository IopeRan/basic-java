package com.BelajarJava;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Erlang Andriyanputra");
        sayHello("Erlang", "Andriyanputra");
    }
    // method overloading
    // memiliki nama method yang sama asal memiliki parameter yang berbeda
    static void sayHello() {
        System.out.println("Hello");
    }
    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
