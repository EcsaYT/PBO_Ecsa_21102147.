package com.Ecsa_Yudistira.PBO.pertemuan3;

public class Paketan {

    private int harga;

    public Paketan(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void shpwInfo() {
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
