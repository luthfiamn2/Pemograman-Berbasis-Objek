/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Soal33 {
    public static void main(String[] args){
        String nama1,nama2,nama3,nama4;
        Scanner inputan= new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap Anda:");
        nama1= inputan.nextLine();
        System.out.print("Masukkan Nim              :");
        nama2= inputan.next();
        System.out.print("Masukkan Semester         :");
        nama3= inputan.next();
        System.out.print("Masukkan Kelas            :");
        nama4= inputan.next();
        System.out.println("Nama                    :"+nama1);
        System.out.println("Nim                     :"+nama2);
        System.out.println("Semester                :"+nama3);
        System.out.println("Kelas                   :"+nama4);
    }
    
}
