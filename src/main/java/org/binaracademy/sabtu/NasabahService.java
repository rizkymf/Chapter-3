package org.binaracademy.sabtu;

import org.binaracademy.topic2.Nasabah;

import java.util.List;
import java.util.Scanner;

public interface NasabahService {

    List<Nasabah> getSemuaNasabahWanita(List<Nasabah> nasabahList);
    List<Nasabah> getSemuaNasabahWanita(List<Nasabah> nasabahList, Long minimumNetworth);
    List<Nasabah> getSemuaNasabahPria(List<Nasabah> nasabahList);
    Long semuaNetworthNasabah(List<Nasabah> nasabahList);
    Long networthSatuNasabah(Nasabah nasabah);
    void inputScanner(Scanner scanner);

}
