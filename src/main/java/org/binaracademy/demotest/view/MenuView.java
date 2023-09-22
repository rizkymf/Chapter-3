package org.binaracademy.demotest.view;

import org.binaracademy.demotest.model.Invoice;
import org.binaracademy.demotest.model.Pesanan;
import org.binaracademy.demotest.model.Product;

import java.util.Arrays;
import java.util.List;

public class MenuView {

    public static final String SEPARATOR = "==================";

    public static final List<Product> PRODUCTS = Arrays.asList(new Product("Nasi Goreng", 15000),
            new Product("Mie Goreng", 10000),
            new Product("Es Teh Manis", 5000),
            new Product("Es Jeruk", 7000)
    );

    public static void showMainMenu() {
        System.out.println(SEPARATOR +
                "\nBinarFud\n" +
                SEPARATOR +
                "\nPilih Menu Makanan: \n");
        PRODUCTS.forEach(product -> {
            System.out.println((PRODUCTS.indexOf(product)+1) + ". " +
                    product.getNamaProduk() + "\t|\t Rp." + product.getHarga());
        });
        System.out.println("99. Lanjut ke pembayaran");
        System.out.println("0. Exit");
        System.out.print("=> ");
    }

    public static void showMenuDetail(Product product) {
        System.out.println("Pesanan\t: " + product.getNamaProduk());
        System.out.println("Harga per pcs\t: " + product.getHarga());
        System.out.print("Jumlah (pilih 0 jika ingin kembali)\t: ");
    }

    public static void showPembayaran(Invoice invoice) {
        System.out.println("Pesanan\t | \t Total \t | \t Harga");
        System.out.println(SEPARATOR);
        invoice.getPesananList().forEach(pesanan1 -> {
            System.out.println(pesanan1.getNamaProduk() + "\t | \t" + pesanan1.getQuantity() + "\t | \t" +
                    pesanan1.getTotalHarga());
        });
        System.out.println("Total pembayaran : Rp." + invoice.getTotalPembayaran());
    }
}
