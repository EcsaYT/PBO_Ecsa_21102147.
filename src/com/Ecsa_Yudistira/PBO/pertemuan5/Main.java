package com.Ecsa_Yudistira.PBO.pertemuan5;

public class Main {
    public static void main(String[] args) {
        Barang[] Keranjang = new Barang[10];

        Barang[] etalase = {
                new Barang("Indomie",3000),
                new Barang("Pulpen",3000),
                new Barang("Pensil",2500),
                new Barang("Botol",5000),
                new Barang("Penghapus",4000)
        };

        System.out.println("Jumlah barang di etalase : ");
        System.out.println("daftar barang di etalase : ");

        int i = 1;
        for (Barang b : etalase){
            System.out.println("Barangbke-"+1);
            b.showInfo();
            i++;
        }
    }
}
