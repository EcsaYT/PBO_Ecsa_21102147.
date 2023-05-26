package com.Ecsa_Yudistira.PBO.pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        int[] nomor = {1, 2, 3, 4, 5};

        try {
            System.out.println(nomor[6]);
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array nya melebihi batas!");
        }
        System.out.println("Proses selesai!");
    }
}
