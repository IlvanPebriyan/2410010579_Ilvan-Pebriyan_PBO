package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class mahasiswa {
    public String npm;
    public String nama;
    public double ipk;
    public int semester;
    
    public mahasiswa(String npm, String nama, double ipk, int semester) {
        this.npm = npm;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void tampilkanData() {
        System.out.println("NPM     :" + npm);
        System.out.println("Nama    :" + nama);
        System.out.println("IPK     :" + ipk);
        System.out.println("Semester:" + semester);
    } 
}
