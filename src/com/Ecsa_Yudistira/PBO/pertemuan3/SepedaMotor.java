package com.Ecsa_Yudistira.PBO.pertemuan3;

public class SepedaMotor {

        // Atributs
         private String merk;
         private String tipe;
         private int harga;

        //constructor
        public SepedaMotor() {}

        // Constructor baru
        public SepedaMotor(String merk, String tipe, int harga) {
            this.merk = merk;
            this.tipe = tipe;
            this.harga = harga;
        }

        //Method
        public String getMerk() {
            return merk;
        }
        public void setMerk(String merk) {
            this.merk = merk;
        }
        public String getTipe() {
            return tipe;
        }
        public void setTipe(String tipe) {
            this.tipe = tipe;
        }
        public int  getHarga() {
            return harga;
        }
        public void setHarga(int harga) {
           this.harga = harga;
        }
        public void showInfo() {
            System.out.println("Merk : " + merk);
            System.out.println("Tipe : " + tipe);
            System.out.println("Harga : " + harga);
            System.out.println();
        }
}
