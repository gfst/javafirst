package com.company;

public class Welcome {

    public static void main(String[] args) {
        String greeting = "Welcome to Core Java SE!";
        for (int i = 1; i <= greeting.length(); i++)
            System.out.print("=");
        System.out.println();
        System.out.println(greeting);
        for (int i = 1; i <= greeting.length(); i++)
            System.out.print("=");
    }
}
