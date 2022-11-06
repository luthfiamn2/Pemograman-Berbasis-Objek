/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelulusan1;
import java.util.Scanner;
/**
 *
 * @author affandeZone
 */
public class KELULUSAN1 {
    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        // Ambil Nama 
        System.out.print("Masukkan Nama anda= ");
        String Nama = inp.next();
           
        // Ambil NIM 
        System.out.print("Masukkan String nim =");
        String nim = inp.next();

        // Ambil Nilai 
        System.out.print("Masukkan int nilai= ");
        int nilai = inp.nextInt();
        
        // Print    
        if(nilai < 3.00) {
           System.out.println("Cukup");
        } else if(nilai < 3.49) { 
        System.out.println("Memuaskan");
        } else if(nilai < 3.74) {
            System.out.println("Sangat Memuaskan ");
} else {
System.out.println("Cum Laude ");
        }

    }
    
}

