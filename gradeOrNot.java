package com.algoritma2;

import java.util.Scanner;
public class gradeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        Double grade = scanner.nextDouble();

         if (grade >= 70 && grade <= 100){
            System.out.println("You Passed");
        }else if( grade <70 && grade >=0) {
            System.out.println("You Failled");
        }else{
            System.out.println("you put invalide number,only accept 0-100");
        }
        scanner.close();
    }
}
