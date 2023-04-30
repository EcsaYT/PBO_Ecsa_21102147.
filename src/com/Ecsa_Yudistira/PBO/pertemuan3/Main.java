package com.Ecsa_Yudistira.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        // Pembuatan class
        SepedaMotor honda = new SepedaMotor("Honda", "Vario 160", 35000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "N Max", 40000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 60000000);

        // Menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        // Uji coba getter & setter
        System.out.println("Motor merk : " + honda.getMerk()+ "Tipe(before) : " + honda.getTipe());
        honda.setTipe("Beat");
        System.out.println("Motor merk : " + honda.getMerk()+ "Tipe(after) : " + honda.getTipe());

    }
}
