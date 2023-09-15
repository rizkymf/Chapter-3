package org.binaracademy.topic2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {

    private String nama;
    private String gender;
    private Date tglLahir = new Date(); // default value jika tgl lahir tidak di set
    private List<Asset> asset;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Asset {
        private String namaAsset;
        private Long nilaiAsset;
        private AssetDetail assetDetail;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AssetDetail {
        private Date boughtDate;
    }

}
