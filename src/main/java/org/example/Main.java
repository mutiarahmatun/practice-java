package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Data types and variables

        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Mutia";
        char q = 'Y';
        boolean flag2 = false;

        // Arithmetic calculation
        int result = a/b;
        int result2 = (int) (a/c);
        System.out.println(result2);
        System.out.println(result);


        // if, else, else-if
        int timeStart = 8;
        int timeFinish = 17;
        int waktuMasuk = 7;
        int waktuPulang = 15;



        if (waktuMasuk <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Selamat, anda masuk tepat waktu");
            System.out.println("Anda sampai " + (timeStart - waktuMasuk) + " jam lebih cepat");
        } else if (waktuMasuk <= timeStart && waktuPulang <= timeFinish ){
            System.out.println("Yeah pulang duluan");
            System.out.println("Anda sampai "+ (waktuMasuk - timeStart) + " jam lebih lama");
        }

    }
}