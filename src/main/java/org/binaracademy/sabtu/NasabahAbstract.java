package org.binaracademy.sabtu;

import org.binaracademy.topic2.Nasabah;

import java.util.List;

public abstract class NasabahAbstract {

    public Nasabah nasabah;

    public static final String BANK = "BANK BINAR";

    public NasabahAbstract(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public NasabahAbstract(Nasabah nasabah, String test) {

    }

    public String introduction() {
        return "Hello " + nasabah.getNama() + " dari " + BANK;
    }

    public abstract List<Nasabah> getSemuaNasabahWanita(List<Nasabah> nasabahList);
    public abstract List<Nasabah> getSemuaNasabahPria(List<Nasabah> nasabahList);
    public abstract Long semuaNetworthNasabah(List<Nasabah> nasabahList);
    public abstract Long networthSatuNasabah();

}
