package com.Ecsa_Yudistira.PBO.pertemuan4;

public class Manajer extends Pegawai{

    public void bonus(int bonus){
        System.out.println("Nama Pegawai : " + nama + "(" + nip +"} Mendapat bonus sebesar " + bonus);
    }

    public void extraInfo(){
        System.out.println("Jabatan Pegawai = Manajer");
    }

    public void bonus(){
        System.out.println("Eror : harap masukkan nominal bonus!");
    }

}
