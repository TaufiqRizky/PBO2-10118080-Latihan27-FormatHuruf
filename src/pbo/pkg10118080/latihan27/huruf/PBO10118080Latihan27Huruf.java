/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118080.latihan27.huruf;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program formating string
 */
public class PBO10118080Latihan27Huruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        System.out.print("Masukan Kalimat : ");
        Scanner a = new Scanner(System.in);
        Kalimat = a.nextLine();
        System.out.println("");
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Huruf Besar : "+ Kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+Kalimat.toLowerCase());
        
    }
    
}
