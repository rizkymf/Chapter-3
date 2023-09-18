package org.binaracademy.topic4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private String namaPesanan;
    private Integer harga;
    private Integer quantity;
    private String pemesan;
}
