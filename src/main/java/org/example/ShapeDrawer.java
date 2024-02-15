package org.example;

import java.util.Scanner;

public class ShapeDrawer {
    Scanner input = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Selamat datang di ASCII draw!");
        System.out.println("Pilih bentuk yang mau digambar");
        System.out.println("1. Segitiga Siku-Siku");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Exit\n");
    }

    public void drawTriangleSS(int height) {
        for (int r = 1; r <= height; r++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangleSK(int height) {
        for(int i=1;i<=height;i++){
            for(int k=height;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void drawShape(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Masukkan panjang segitiga siku-siku ");
                int height = input.nextInt();
                drawTriangleSS(height);
                break;

            case 2:
                System.out.println("Masukkan panjang segitiga sama kaki");
                int height2 = input.nextInt();
                drawTriangleSK(height2);
                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid input");
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.println("Masukkan pilihan anda ");
            int choice = input.nextInt();
            drawShape(choice);
        }
    }

    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.run();
    }
}
