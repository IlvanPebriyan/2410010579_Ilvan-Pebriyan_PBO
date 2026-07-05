/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.sql.Date;

public class konten {
    private int id_konten;
    private String judul_konten;
    private int id_kategori;
    private int id_platform;
    private Date tanggal_tayang;
    private String Status;
    
    public konten(){}
    
    public int getidkonten(){return id_konten;}
    public void setidkonten(){this.id_konten = id_konten;}
    
    public String getjudulkonten(){return judul_konten;}
    public void setidjudulkonten(){this.judul_konten = judul_konten;}
    
    public int getidkategori(){return id_kategori;}
    public void setidkategori(){this.id_kategori = id_kategori;}
    
    public int getidplatform(){return id_platform;}
    public void setidplatform(){this.id_platform = id_platform;}
    
    public Date gettanggaltayang(){return tanggal_tayang;}
    public void settanggaltayang(){this.tanggal_tayang = tanggal_tayang;}

    public String getStatus(){return Status;}
    public void setStatus(){this.Status = Status;}
}
