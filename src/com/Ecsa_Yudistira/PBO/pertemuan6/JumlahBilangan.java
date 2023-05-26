package com.Ecsa_Yudistira.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JumlahBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan Bilangan : " );
            int bilangan1 = input.nextInt();


            System.out.println("Masukkan Pembaginya : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);

        }
        catch(InputMismatchException  e) {
            System.out.println("Input tidak valid, Harap masukkana Bilangan bulat!");
        }


        try {
            Scanner input3 = new Scanner(System.in);
            System.out.println("Masukkan bilangan : ");
            int bilangan3 = input3.nextInt();

            Scanner input4 = new Scanner(System.in);
            System.out.println("Masukkan pembaginya : ");
            int bilangan4 = input4.nextInt();

            int hasil2 = bilangan3/bilangan4;
            System.out.println(bilangan3 + " / " + bilangan4 + " = " + hasil2);
        }

        catch(ArithmeticException e) {
            System.out.println("Input tidak valid, pembagi tidak boleh nol!");
        }

        System.out.println("Selesai");
    }
}
