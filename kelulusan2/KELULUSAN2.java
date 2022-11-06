/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelulusan2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class KELULUSAN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int tinggi;
        String Jeniskelamin;
        System.out.println("Masukkkan Jeniskelamin = ");
        Jeniskelamin= n1.nextLine();
        System.out.println("Tinggi = ");
        tinggi= n1.nextInt();
        
        System.out.println("Kesimpulan : ");
      if("laki".equals(Jeniskelamin)) {
        if (tinggi <= 170) {
            System.out.println("Gagal"); }
        
        else if (tinggi >= 170) {
            System.out.println("Berhasil"); }
      
      } else if("bini".equals(Jeniskelamin)) {
       if (tinggi <= 160) {
            System.out.println("gagal"); }       
        
        else if (tinggi >= 160) {
            System.out.println("lulus"); }
      }  
    }
    }
