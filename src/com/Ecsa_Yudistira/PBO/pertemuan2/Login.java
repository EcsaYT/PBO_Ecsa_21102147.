package com.Ecsa_Yudistira.PBO.pertemuan2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String Username;
        String Password;

        Password = "2147";
        Username = "Ecsa Yudistira";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Massukkan Username : ");
        String username = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Massukkan Password : ");
        String password = input2.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Login berhasil silahkan masuk");
        } else if (username.equals(Username)) {
            System.out.println("Silahkan login dengan Username dan password yang sah!");
        } else if (password.equals(Password)) {
            System.out.println("Silahkan login dengan username dan Password yang sah!");
        } else {
            System.out.println("Username dan Password Anda salah");
        }

    }
}
