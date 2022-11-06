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
public class lat7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in).useDelimiter("'\n");
      System.out.println("Siapakah presiden pertama indonesia?");
      System.out.println("a. Dr. Ir. H. Soekarno");
      System.out.println("b. BJ. Habibie ");
      System.out.println("c. Megawati Soekarno Putri");
      System.out.println("d. Abdurrahman Wahid");
      char pilih;
        pilih = scan.next().charAt(0);
    switch(pilih){
      case 'a':
      System.out.println("Benar!");
      break;
      case 'b':
      System.out.println("Salah, jawabannya adalah Dr. Ir. H. Soekarno");
      break;
      case 'c':
      System.out.println("Salah, jawabannya adalah Dr. Ir. H. Soekarno");
      case 'd':
      System.out.println("Salah, jawabannya adalah Dr. Ir. H. Soekarno");
      break;
      default:
      System.out.println("Sistem Error");
    
}
}
}
