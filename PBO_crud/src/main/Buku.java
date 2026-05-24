/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String idBuku;
    private String judul;
    private String penulis;
    private int harga;
    
    //C.1 Kosong
    public Buku() {
        this.idBuku = "B000";
        this.judul = "Belum ada judul"; 
        this.penulis = "Anonim"; 
        this.harga = 0;
    }
    //C.2 id dan judul
    public Buku(String idBuku, String judul) {
        this.idBuku = idBuku;
        this.judul = judul; 
        this.penulis = "Anonim"; 
        this.harga = 0;
    }
    //C.3 Semua atribut
    public Buku(String idBuku, String judul, String penulis, int harga) {
        this.idBuku = idBuku;
        this.judul = judul; 
        this.penulis = penulis; 
        this.harga = harga;
    }
    
    //Void'
    //1.Create
    public void simpanData() {
        String sql = "INSERT INTO table_buku (id_buku, judul, penulis, harga) VALUES ('" 
                     + this.idBuku + "', '" + this.judul + "', '" + this.penulis + "', " + this.harga + ");";
        System.out.println("[CREATE] Menjalankan SQL:");
        System.out.println(sql);
        System.out.println("Data buku \"" + this.judul + "\" berhasil disimpan!\n");
    }
    //2.Update
    public void ubahHarga(int hargaBaru) {
        this.harga = hargaBaru;
        String sql = "UPDATE table_buku SET harga = " + hargaBaru + " WHERE id_buku = '" + this.idBuku + "';";
        System.out.println("[UPDATE] Menjalankan SQL:");
        System.out.println(sql);
        System.out.println("Harga buku dengan ID " + this.idBuku + " berhasil diupdate ke Rp" + hargaBaru + "\n");
    }
    //3.Delate
    public void hapusData() {
        String sql = "DELETE FROM table_buku WHERE id_buku = '" + this.idBuku + "';";
        System.out.println("[DELETE] Menjalankan SQL:");
        System.out.println(sql);
        System.out.println("Buku dengan ID " + this.idBuku + " berhasil dihapus dari database.\n");
    }
    //Retune Value
    //4.Read
    public String ambilDetailBuku() {
        String sql = "SELECT * FROM table_buku WHERE id_buku = '" + this.idBuku + "';";
        System.out.println("[READ] Menjalankan SQL:");
        System.out.println(sql);
        
        // Mengembalikan data string berupa detail object
        return "Detail Buku -> ID: " + idBuku + " | Judul: " + judul + " | Penulis: " + penulis + " | Harga: Rp" + harga + "\n";
    }
}