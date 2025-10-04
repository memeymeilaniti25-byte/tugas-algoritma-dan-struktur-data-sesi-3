package com.algoritma2;
import java.util.Scanner;

public class klasifikasiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai");
        Double nilai = scanner.nextDouble();

         if (nilai >= 80 && nilai <= 100){
            System.out.println("A");
        }else if( nilai >= 70 && nilai < 80) {
            System.out.println("B");
        }else if( nilai >= 60 && nilai < 70) {
            System.out.println("C");
        }else if( nilai >= 50 && nilai < 60) {
            System.out.println("D");
        }else if( nilai >= 0 && nilai < 50){
            System.out.println("F");
        }else{
            System.out.println("Nilai yang dimasukkan tidak valid");
        }
        scanner.close();
    }


    }


    


    

