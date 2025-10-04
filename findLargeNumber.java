package com.algoritma2;
import java.util.Scanner;

public class findLargeNumber {
    public static void main(String[] args) {
    System.out.println("Temukan angka terbesar");
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan bilangan bulat a");
    int a = input.nextInt();
    System.out.println("Masukkan bilangan bulat b");
    int b = input.nextInt();
    System.out.println("Masukkan bilangan bulat c");
    int c = input.nextInt();
    
    int angkaTerbesar;
    if(a>=b && a>=c){
        angkaTerbesar = a;
        System.out.println("Angka terbesar adalah a="+ angkaTerbesar);
    }else if(b>=a && b>=c){
        angkaTerbesar = b;
        System.out.println("Angka terbesar adalah b="+ angkaTerbesar);
    }else{
        angkaTerbesar = c;
        System.out.println("Angka terbesar adalah c="+ angkaTerbesar);
        input.close();
    }
}
}



    


    

