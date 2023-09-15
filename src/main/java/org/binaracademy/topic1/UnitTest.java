package org.binaracademy.topic1;

public class UnitTest {

    public Integer tambah(Integer a, Integer b) {
        return a + b;
    }

    public Integer kurang(Integer a, Integer b) {
        return a - b;
    }

    public Integer kurangYangSalah(Integer a, Integer b) {
        return a + a - b;
    }

    public String appender(Integer loopCount) throws NullPointerException {
        String akhir = "";
        // klo loopCount itu ganjil, kasih return "ganjil"
        if(loopCount % 2 != 0) {
            return "ganjil";
        }
        if(loopCount < 1) {
            return "salah";
        }
        for(int i = 1; i <= loopCount; i++) {
            akhir+="a";
        }
        return akhir;
    }


}
