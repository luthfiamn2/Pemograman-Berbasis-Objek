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
public class lat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int belanja = 0;
      Scanner scan = new Scanner(System.in).useDelimiter("'\n");
      System.out.print("Total Belanjaan: Rp ");
      belanja = scan.nextInt();
      if (belanja > 100000 ) {
       System.out.println("Selamat, anda mendapatkan diskon!");
    }
       System.out.println("Terima kasih...");
    }
 
}

