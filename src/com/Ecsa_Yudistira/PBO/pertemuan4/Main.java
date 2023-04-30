package com.Ecsa_Yudistira.PBO.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajerkami = new Manajer();
        Pegawai pegawaikami = new Pegawai();

        manajerkami.nip = 193067587 ;
        manajerkami.nama = "Hasan Sadikin";

        pegawaikami.nip = 198067998;
        pegawaikami.nama = "Asep Pratama";


        manajerkami.showInfo();
        manajerkami.extraInfo();
        manajerkami.bonus(1200000);
        manajerkami.bonus();

        pegawaikami.showInfo();

    }
}
