package org.binaracademy.sabtu;

import org.binaracademy.topic2.Nasabah;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NasabahServiceImpl implements NasabahService {

    String userAdmin;

    public NasabahServiceImpl(String userAdmin) {
        this.userAdmin = userAdmin;
    }

    @Override
    public List<Nasabah> getSemuaNasabahWanita(List<Nasabah> nasabahList) {
        return null;
    }

    @Override
    public List<Nasabah> getSemuaNasabahWanita(List<Nasabah> nasabahList, Long minimumNetworth) {
        return null;
    }

    @Override
    public List<Nasabah> getSemuaNasabahPria(List<Nasabah> nasabahList) {
        return Optional.of(nasabahList)
                .map(Collection::stream)
                .orElse(Stream.empty())
                .filter(nasabah -> nasabah.getGender().equals("Pria"))
                .collect(Collectors.toList());
    }

    @Override
    public Long semuaNetworthNasabah(List<Nasabah> nasabahList) {
        return null;
    }

    @Override
    public Long networthSatuNasabah(Nasabah nasabah) {
        return null;
    }

    @Override
    public void inputScanner(Scanner scanner) {
        
    }
}
