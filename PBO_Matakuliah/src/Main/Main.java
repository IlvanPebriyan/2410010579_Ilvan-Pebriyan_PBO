/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import akademisi.mataKuliah;

public class Main {

    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("2410010579", "Ilvan Pebriyan", 3.75, 4);
        
        mataKuliah mk = new mataKuliah("IF123", "Pemrograman Berorientasi Objek");
        mk.infoMK();
        
        System.out.println("===Data Mahasiswa===");
        mhs.tampilkanData();
        System.out.println("===Data Mata Kuliah===");
        mk.infoMK();
    }
    
}
