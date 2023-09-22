package org.binaracademy.topic4;

import java.util.Scanner;

public class Test {

    public void testing() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch(input) {
            case 1:
                System.out.println("satu");
                break;
            default:
                System.out.println("entah");
                break;
        }
        scanner.close();
    }
}
