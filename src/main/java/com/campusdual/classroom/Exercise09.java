package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        doWhileLoop(15);
    }

    public static void doWhileLoop(int num) {
        int x = 0;

        do {
            System.out.println("Entra con valor: " + x + ", sale con valor: " + ++x);
        } while (x < num);
    }
}
