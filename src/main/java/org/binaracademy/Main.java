package org.binaracademy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        if(args == null) {
            throw new NullPointerException();
        }
    }
}