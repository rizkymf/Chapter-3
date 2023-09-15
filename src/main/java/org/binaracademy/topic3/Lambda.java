package org.binaracademy.topic3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {

    public void contohLambda() {
        List<Integer> nilaiKelasA = Arrays.asList(100, 80, 60, 50, 70);
        Collections.max(nilaiKelasA);
        Collections.min(nilaiKelasA);

        for(int i = 0; i < nilaiKelasA.size(); i++) {
            // implementasi
        }

        for (Integer nilai : nilaiKelasA) {
            // implementasi
        }

        nilaiKelasA.forEach(val -> System.out.println(val));

        ContohFuncInterface funcInterfaceNew = new ContohFuncInterface() {
            @Override
            public Integer findMin(List<Integer> integers) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (Integer num : integers) {
                    if(num < min) {
                        min = num;
                    }
                }
                return min;
            }
        };

        ContohFuncInterface funcInterface = (integers) -> {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (Integer num : integers) {
                if(num < min) {
                    min = num;
                }
            }
            return min;
        };

        // ga akan bisa karena method nya lebih dari 1
//        NotFunctionalInterface notFunctionalInterface = (a, b) -> {
//
//            return null;
//        }

        System.out.println("Nilai terendah : " + funcInterface.findMin(nilaiKelasA));

        Robot robot = new Robot();

        Consumer<String> robotMakerA = n -> {
            robot.setNama(n);
            robot.setModel("model A");
        };

        BiConsumer<String, String> robotMakerB = (n, v) -> {
            robot.setNama(n);
            robot.setModel(v);
        };

        Supplier<Integer> cariMax = () -> {
            int max = Integer.MIN_VALUE;
            for (Integer score : nilaiKelasA) {
                if(score > max) {
                    max = score;
                }
            }
            return max;
        };

        System.out.println("nilai max : " + cariMax.get());

        robotMakerA.accept("Zidane");

        System.out.println("Nama robot : " + robot.getNama());

        Consumer<String> nonMethodReference = n -> System.out.println(n);
        nonMethodReference.accept("halo aku bukan method reference");

        Consumer<String> methodReference = System.out::println;
        methodReference.accept("halo klo aku method reference nih");

        nilaiKelasA.forEach(val -> System.out.print(val)); // dengan lambda
        System.out.println();
        nilaiKelasA.forEach(System.out::print); // dengan method reference

//        BiConsumer<String, String> robotMakerC = Robot::new;
    }
}
