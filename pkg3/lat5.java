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
public class lat5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a = (int) (Math.random()*10), b = (int) (Math.random()*10), hasil = a+b;
      Scanner scan = new Scanner(System.in).useDelimiter("\n");
      System.out.println("Berapakah hasil dari "+a+" dan "+b+" ?");
      int jawaban = scan.nextInt();
      if (jawaban == hasil){
        System.out.println("Selamat, Jawaban anda benar");
     }else{
        System.out.println("Maaf, Jawaban yang benar adalah"+hasil);
    }
    }
}
