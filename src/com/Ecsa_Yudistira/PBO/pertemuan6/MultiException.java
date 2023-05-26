package com.Ecsa_Yudistira.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan bilangan : ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukkan pembaginya : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1 / bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);
        } catch (InputMismatchException e) {
            System.out.println("Eror ga bisa di proses : {");
        } catch (ArithmeticException e) {
            System.out.println("Eror ga bisa di run : {");
        }

        System.out.println("Selesai");
    }
}
