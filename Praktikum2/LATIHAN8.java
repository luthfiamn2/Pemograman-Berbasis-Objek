/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;


public class LATIHAN8 {
    public static void main(String[] args){
        String nama1,nama2;
        Scanner inputan= new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap Anda:");
        nama1= inputan.nextLine();
        System.out.println("Halo..."+nama1+", Ini adalah penggunaan nextLine()");
        System.out.print("Masukkan Nama Lengkap Anda:");
        nama2= inputan.next();
        System.out.println("Halo..."+nama2+". Ini adalah penggunaan next()");
        
        
        
        
    }
    
}
