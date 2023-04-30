package com.Ecsa_Yudistira.PBO.pertemuan3;

public class Mainpkt {
    public static void main(String[] args) {

        System.out.println("Paket Gebyar Indosat menyediakan : ");

        Paket freedoom = new Paket("Freedoom", "Bonus Kuota Internet 1gb");
        Paket promo = new Paket("Hot Promo", "gratis Chat selama 7 hari");
        Paket spesial = new Paket("Spesial", "Pulsa Cashback 20%");
        Paketan freedoom2 = new Paketan(20000);
        Paketan promo2 = new Paketan(30000);
        Paketan spesial2 = new Paketan(50000);

        freedoom.showInfo();
        freedoom2.shpwInfo();
        promo.showInfo();
        promo2.shpwInfo();
        spesial.showInfo();
        spesial2.shpwInfo();

        System.out.println("Paket yang dibeli : ");

        System.out.println("Nama Paket : " + freedoom.getNamapaket());
        System.out.println("Benefit : " + freedoom.getBenefit());
        System.out.println("Harga : " + freedoom2.getHarga());

    }
}
