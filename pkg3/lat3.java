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
public class lat3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String jawaban, jawaban1;
      Scanner scan = new Scanner(System.in).useDelimiter("\n");
      System.out.print("Apakah anda mahasiswa ? (iya) ");
      jawaban = scan.next();
      if( ("iya".equals(jawaban))||("IYA" .equals (jawaban))){
         System.out.print("Apakah anda selalu terlambat masuk kelas ? ");
         jawaban1 = scan.next();
         if( ("TIDAK". equals (jawaban1))||("tidak".equals (jawaban1)) ){
         System.out.println("Bagus, Pertahankan !!!");
    }
}
}
}

