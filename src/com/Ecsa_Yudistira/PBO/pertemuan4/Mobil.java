package com.Ecsa_Yudistira.PBO.pertemuan4;

public class Mobil extends Kendaraan{

    int penumpang;

    public void mbl() {
        System.out.println("Spesifikasi Mobil : ");
    }

    public void bergerak() {
        System.out.println("Kapasitas Penumpang : " + penumpang);
    }
}
