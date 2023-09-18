import org.binaracademy.sabtu.MenuService;
import org.binaracademy.sabtu.NasabahAbstract;
import org.binaracademy.sabtu.NasabahAbstractImpl;
import org.binaracademy.sabtu.NasabahService;
import org.binaracademy.sabtu.OrderService;
import org.binaracademy.topic2.Nasabah;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SabtuTest {

    NasabahService nasabahService;
    OrderService orderService;
    MenuService menuService;
    NasabahAbstract nasabahAbstract;
    List<Nasabah> nasabahList = Arrays.asList(
            Nasabah.builder().nama("Sartika").gender("Wanita").asset(Arrays.asList(new Nasabah.Asset("Rumah", 300_000_000l, null))).build(),
            Nasabah.builder()
                    .nama("Arda Mulya Darmawan")
                    .gender("Pria")
                    .tglLahir(new Date())
                    .asset(Arrays.asList(new Nasabah.Asset("Rumah", 700000000l, null),
                            new Nasabah.Asset("Rolls Royce", 7000000000l, null)))
                    .build(),
            Nasabah.builder()
                    .nama("Udin Uhuy")
                    .gender("Pria")
                    .tglLahir(new Date())
                    .build()
    );

    @Test
    void testNasabah() {
        System.out.println("------------------------------------------");
        List<Nasabah> nasabahPria = nasabahService.getSemuaNasabahPria(nasabahList);
        Assertions.assertEquals(2, nasabahPria.size());

        Nasabah nasabah = new Nasabah("Udin Uhuy", "Pria", new Date(), null);
        nasabah.setNama("Udin Uhuy");
        nasabah.setGender("Pria");
        nasabah.setTglLahir(new Date());

//        nasabahAbstract = new NasabahAbstractImpl(nasabahList.get(0));
        nasabahAbstract.networthSatuNasabah();
    }

    @Test
    void testOrder() {
        boolean isActive = true;
        do {

            // User liat list menu
            menuService.getAllMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pilih menu => ");
            scanner.nextLine();
            // User pilih salah satu menu
            menuService.menuDetail("abc");
            // User pilih jumlah yang akan dipesan
            orderService.order("abc", 2);
            // User kembali liat list menu
            // User melakukan pembayaran
            isActive = false;
        } while(isActive);
        orderService.payment(new HashMap<>(), "Test");
    }
}
