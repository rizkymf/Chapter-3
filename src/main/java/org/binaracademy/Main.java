package org.binaracademy;

import org.binaracademy.demotest.controller.UserInputController;
import org.binaracademy.sabtu.NasabahService;
import org.binaracademy.sabtu.NasabahServiceImpl;
import org.binaracademy.sabtu.OrderService;
import org.binaracademy.topic2.Nasabah;
import org.binaracademy.topic2.NetworthService;
import org.binaracademy.topic2.NetworthServiceImpl;
import org.binaracademy.topic3.Robot;
import org.binaracademy.topic4.Orders;
import org.binaracademy.topic4.StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        NetworthService networthService = new NetworthServiceImpl();
//
//        Nasabah nasabahArda = Nasabah.builder()
//                .nama("Arda Mulya Darmawan")
//                .gender("Pria")
//                .tglLahir(new Date())
//                .asset(Arrays.asList(new Nasabah.Asset("Rumah", 700000000l, null),
//                        new Nasabah.Asset("Rolls Royce", 7000000000l, null)))
//                .build();
//        Long totalNetworthArda = networthService.calculateNetworth(nasabahArda);
//        System.out.println("total networth " + nasabahArda.getNama() + " : Rp." + totalNetworthArda);
//
//        Nasabah nasabahUdin = Nasabah.builder()
//                .nama("Udin Uhuy")
//                .gender("Pria")
//                .tglLahir(new Date())
//                .build();
//        Long totalNetworthUdin = networthService.calculateNetworth(nasabahUdin);
//        System.out.println("total networth " + nasabahUdin.getNama() + " : Rp." + totalNetworthUdin);
//
//        List<Nasabah> nasabahList = Arrays.asList(
//                Nasabah.builder().nama("Sartika").gender("Wanita").asset(Arrays.asList(new Nasabah.Asset("Rumah", 300_000_000l, null))).build(),
//                nasabahArda,
//                nasabahUdin
//        );
//        Long totalNetworthSemuaWanita = networthService.calculateNetworthAllWanita(nasabahList);
//        System.out.println("total networth semua wanita : Rp." + totalNetworthSemuaWanita);
//
//        System.out.println("------------------------------------------");
//
//        List<String> orders;
////        List<Nasabah> nasabahPria = nasabahService.getSemuaNasabahPria(nasabahList);
////        nasabahPria.forEach(nasabah -> System.out.println(nasabah.getNama()));
//
//        // input 1 >> Nasi Goreng
//
//        StreamDemo streamDemo = new StreamDemo();
//        List<String> namaNilai = streamDemo.namaNilai(Arrays.asList(100, 90, 85, 90, 95), Arrays.asList("Budy", "Udin", "Sabrina", "Mas Gun", "Ariel"));
////        namaNilai.forEach(System.out::println);
//
//        List<String> name = Arrays.asList(null, "Sabrina", "", "Udin", "Budy", "       ", "Mas Gun");
//        streamDemo.bikinStream();
//
//        System.out.println("-------------------------------------");
//        List<String> orderedName = streamDemo.ordering(name);
//        orderedName.forEach(System.out::println);
//        streamDemo.reverseOrdering(name).forEach(System.out::println);
//
//        List<Orders> ordersList = Arrays.asList(Orders.builder().harga(10000).namaPesanan("Nasi Goreng").quantity(10).build(),
//                Orders.builder().harga(5000).namaPesanan("Es Jeruk").quantity(10).build());
//        System.out.println("Total pesanan anda : Rp." + streamDemo.hitungTotal(ordersList));
//        System.out.println("Any Match : " + streamDemo.demoAnyMatch(name, "S"));
//        System.out.println("All Match : " + streamDemo.demoAllMatch(name, "S"));

        UserInputController controller = new UserInputController();
    }
}