package com.algoritma2;
import java.util.Scanner;

public class PositifNegatifNol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.println("Angka Acak");
        bilangan = input.nextInt();

         if (bilangan > 0 ){
            System.out.println("Bilangan Positif");
        }else if( bilangan < 0) {
            System.out.println("Bilangan Negatif");
        }else{
            System.out.println("Bilangan Nol");
        }
        input.close();
    }
}


