/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        System.out.println("=== DEMO PROGRAM CRUD & CONSTRUCTOR JAVA ===\n");

        // 1.CONSTRUCTOR 1 (Kosong)
        System.out.println("--- Objek 1 (Constructor Kosong) ---");
        Buku buku1 = new Buku();
        // Menampilkan data dengan method nilai balik (Read)
        System.out.println(buku1.ambilDetailBuku());

        // 2.CONSTRUCTOR 2 (Sebagian Atribut)
        System.out.println("--- Objek 2 (Constructor ID & Judul) ---");
        Buku buku2 = new Buku("B002", "Pemrograman Java Modern");
        // Melakukan aksi simpan data dengan method tanpa nilai balik (Create)
        buku2.simpanData();

        // 3.CONSTRUCTOR 3 (Atribut Lengkap)
        System.out.println("--- Objek 3 (Constructor Lengkap) ---");
        Buku buku3 = new Buku("B003", "Struktur Data C++", "Ranma Ahmmad Sadi", 85000);
        
        // Tampilkan data awal (Read)
        System.out.println(buku3.ambilDetailBuku());
        
        // Update harga buku (Update)
        buku3.ubahHarga(95000);
        
        // Tampilkan setelah update (Read)
        System.out.println(buku3.ambilDetailBuku());
        
        // Hapus data buku (Delete)
        buku3.hapusData();
    }
}
