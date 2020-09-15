package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 3, b = 4;
        System.out.println("Hello, world");
        a = b - a;
        b = b - a;
        a = b + a;
        System.out.print(a); System.out.print("      "); System.out.print(b);
    }
}
