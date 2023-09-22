package org.binaracademy.demotest.service;

import org.binaracademy.demotest.model.Pesanan;

import java.util.List;
import java.util.Optional;

public class PesananService {

    public Integer totalPembayaran(List<Pesanan> pesananList) {
        return Optional.of(pesananList)
                .map(pesanan -> pesanan.stream()
                            .reduce(0, (result, order) -> result + order.getTotalHarga(), Integer::sum))
                .orElse(0);
    }
}
