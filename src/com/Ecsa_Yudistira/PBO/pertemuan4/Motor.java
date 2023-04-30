package com.Ecsa_Yudistira.PBO.pertemuan4;

public class Motor extends Kendaraan{

    int kecepatan;

    public void mtr() {
        System.out.println("Spesifikasi Motor : ");
    }

    public void Bergerak() {
        System.out.println("Kecepatan Motor : " + kecepatan + " Km/Jam");
    }
}
