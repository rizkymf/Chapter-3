package org.binaracademy.topic2;

import java.util.List;

public interface NetworthService {

    Long calculateNetworth(Nasabah nasabah);
    Long calculateNetworthAllWanita(List<Nasabah> nasabahList);

}
