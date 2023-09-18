package org.binaracademy.sabtu;

import java.util.List;

public interface MenuService {

    abstract List<String> getAllMenu();
    String menuDetail(String idMenu);
    void tambahMenu();

}
