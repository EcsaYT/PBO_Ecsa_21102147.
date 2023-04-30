package com.Ecsa_Yudistira.PBO.pertemuan3;

public class Paket {

    private String namapaket;
    private String benefit;

    public Paket(String namapaket, String benefit) {
        this.namapaket = namapaket;
        this.benefit = benefit;
    }

    public String getNamapaket() {
        return namapaket;
    }
    public void setNamapaket(String namapaket) {
        this.namapaket = namapaket;
    }
    public String getBenefit() {
        return benefit;
    }
    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public void showInfo() {
        System.out.println("Nama Paket : " + namapaket);
        System.out.println("Benefit : " + benefit);
        System.out.println();
    }

}
