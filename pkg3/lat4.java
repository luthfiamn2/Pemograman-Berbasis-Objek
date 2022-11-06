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
public class lat4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in).useDelimiter("'\n");
      System.out.println("Apakah anda mahasiswa ya, Nama Muhammad Luthfi Amin");
      String jawaban = scan.next();
      if ("Y".equals (jawaban)){
        System.out.println("Selamat berjuang di its mandiri");
   }else{
        System.out.println("Selamat datang di its mandiri");
    }
    
}
}
