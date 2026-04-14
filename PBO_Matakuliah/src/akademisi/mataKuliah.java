/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package akademisi;

/**
 *
 * @author ASUS
 */
public class mataKuliah {

    public String kode_mk;
    public String nama_mk;
            
    public mataKuliah(String kode, String nama) {
        this.kode_mk = kode;
        this.nama_mk = nama;
    }
    
    public void infoMK() {
        System.out.println("Kode MK :" + kode_mk);
        System.out.println("Nama Mk :" + nama_mk);
    }
}
