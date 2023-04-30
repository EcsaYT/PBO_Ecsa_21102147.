package com.Ecsa_Yudistira.PBO.pertemuan4;

public class Mainkdr {
    public static void main(String[] args) {
        Mobil mobilku_2147 = new Mobil();
        Motor motorku_2147 = new Motor();

        mobilku_2147.thndibuat = 2018;
        mobilku_2147.merk = "Toyota";
        mobilku_2147.penumpang = 7;

        motorku_2147.thndibuat = 2017;
        motorku_2147.merk = "Yamaha";
        motorku_2147.kecepatan = 30;

        mobilku_2147.mbl();
        mobilku_2147.showInfo();
        mobilku_2147.bergerak();

        motorku_2147.mtr();
        motorku_2147.showInfo();
        motorku_2147.Bergerak();
    }
}
