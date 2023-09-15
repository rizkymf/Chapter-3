package org.binaracademy.topic2;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class NetworthServiceImpl implements NetworthService {

    @Override
    public Long calculateNetworth(Nasabah nasabah) {
//        Long result = 0l;

        /**
         * dengan cara try catch
         */
//        try {
//            List<Nasabah.Asset> assetList = nasabah.getAsset();
//            for(Nasabah.Asset asset : assetList) {
//                result += asset.getNilaiAsset();
//            }
//        } catch (Exception e) {
//            return 0l;
//        }

        /**
         * dengan conditional
         */
//        nasabah.getAsset() == null ? result : 0l; // ternary
//        if(nasabah.getAsset() == null) {
//            return 0l;
//        }
//        for(Nasabah.Asset asset : assetList) {
//            if(asset.getAssetDetail() == null) {
//                asset.setAssetDetail(new Nasabah.AssetDetail(new Date()));
//            }
//            result += asset.getNilaiAsset();
//        }

        /**
         * dengan Optional
         */
//        List<Nasabah.Asset> assetList = Optional.ofNullable(nasabah.getAsset())
//                .orElse(Collections.emptyList());
//        for(Nasabah.Asset asset : assetList) {
//            result += asset.getNilaiAsset();
//        }
//        return result;
        return Optional.ofNullable(nasabah.getAsset())
                .map(assets -> {
                    long result = 0l;
                    for(Nasabah.Asset asset : assets) {
                        result+=asset.getNilaiAsset();
                    }
                    return result;
                })
                .orElse(0l);
    }

    @Override
    public Long calculateNetworthAllWanita(List<Nasabah> nasabahList) {
        Long total = 0l;
        for(Nasabah nasabah: nasabahList) {
            Long hitung = Optional.of(nasabah)
                    .filter(nasabahDetail -> nasabahDetail.getGender().equals("Wanita"))
                    .map(nasabahDetail -> nasabahDetail.getAsset())
                    .map(assets -> {
                        long result = 0l;
                        for (Nasabah.Asset asset : assets) {
                            result += asset.getNilaiAsset();
                        }
                        return result;
                    })
                    .orElse(0l);
            total+=hitung;
        }
        return total;
    }

    private String test(Nasabah nasabah) {
        if(nasabah.getNama().startsWith("A")) {
            System.out.println("ngapain");
            if(nasabah.getGender().equals("Pria")) {
                if(nasabah.getAsset().size() > 3) {

                }
            }
            System.out.println("ngapain lagi");
        }

        Optional.of(nasabah)
                .filter(nasabahDetail -> nasabahDetail.getNama().startsWith("A"))
                .map(nasabahDetail -> {
                    System.out.println("ngapain");
                    return nasabahDetail;
                })
                .filter(nasabahDetail -> nasabahDetail.getGender().equals("Pria"))
                .filter(nasabahDetail -> nasabahDetail.getAsset().size() > 3)
                .map(nasabahDetail -> {
                    System.out.println("ngapain lagi");
                    return nasabahDetail;
                })
                .ifPresent(nasabahDetail -> System.out.println(nasabahDetail.getNama()));
        return null;
    }

}
