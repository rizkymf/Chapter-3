package org.binaracademy.sabtu;

import org.binaracademy.topic2.Nasabah;

import java.util.List;

public class NasabahAbstractImpl extends NasabahAbstract {
    public NasabahAbstractImpl(Nasabah nasabah) {
        super(nasabah);
    }

    @Override
    public List<Nasabah> getSemuaNasabahWanita(List<Nasabah> nasabahList) {
        return null;
    }

    @Override
    public List<Nasabah> getSemuaNasabahPria(List<Nasabah> nasabahList) {
        return null;
    }

    @Override
    public Long semuaNetworthNasabah(List<Nasabah> nasabahList) {
        introduction();
        return null;
    }

    @Override
    public Long networthSatuNasabah() {
        return this.nasabah.getAsset().get(0).getNilaiAsset();
    }
}
