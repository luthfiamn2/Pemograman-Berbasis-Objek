/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum.pkg3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class soo3 {

    private static String keliling_persegi;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in).useDelimiter("\n");
     System.out.println("pilih metode");
     System.out.println("1. menghitung luas persegi");
     System.out.println("2. menghitung keliling pergegi");
     System. out.println("pilihan = ");
     
     int input_menu = scan.nextInt();
     switch(input_menu){
        case 1 -> {
            System.out.print ("masukkan panjang sisi perseqi =");
            int s = scan.nextInt () ;
            int luas_persegi = s*s;
            System.out.println("luas persegi adalah = "+luas_persegi+"cm");
            }
        case 2 -> {
            System.out.print("masukkan panjang sisi =");
            int s1 = scan.nextInt() ;
            int keliling_pergegi = 4 * s1;
            System.out.println("keliling persegi adalah="+keliling_persegi+"cm");
            }
        default -> System.out.println("SISTEM ERROR") ;
    }
    }   

}