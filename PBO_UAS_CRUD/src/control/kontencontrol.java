/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import db.Koneksi;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class kontencontrol {
    
    // READ
    public void tampilData(DefaultTableModel model) {
        model.setRowCount(0);
        try {
            Connection conn = new Koneksi().getConnection();
            String sql = "SELECT k.id_konten, k.judul_konten, kat.nama_kategori, p.nama_platform, k.tanggal_tayang, k.status " +
                         "FROM konten k " +
                         "LEFT JOIN kategori_konten kat ON k.id_kategori = kat.id_kategori " +
                         "LEFT JOIN platform p ON k.id_platform = p.id_platform";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Object[] row = {
                    rs.getInt("id_konten"),
                    rs.getString("judul_konten"),
                    rs.getString("nama_kategori"),
                    rs.getString("nama_platform"),
                    rs.getDate("tanggal_tayang"),
                    rs.getString("status")
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("Error Tampil Data: " + e.getMessage());
        }
    }

    // CREATE
    public boolean tambahKonten(String judul, int idKategori, int idPlatform, String tanggal, String status) {
        try {
            Connection conn = new Koneksi().getConnection();
            String sql = "INSERT INTO konten (judul_konten, id_kategori, id_platform, tanggal_tayang, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, judul);
            ps.setInt(2, idKategori);
            ps.setInt(3, idPlatform);
            ps.setString(4, tanggal);
            ps.setString(5, status);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error Tambah Konten: " + e.getMessage());
            return false;
        }
    }

    // UPDATE
    public boolean ubahKonten(int idKonten, String judul, int idKategori, int idPlatform, String tanggal, String status) {
        try {
            Connection conn = new Koneksi().getConnection();
            String sql = "UPDATE konten SET judul_konten=?, id_kategori=?, id_platform=?, tanggal_tayang=?, status=? WHERE id_konten=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, judul);
            ps.setInt(2, idKategori);
            ps.setInt(3, idPlatform);
            ps.setString(4, tanggal);
            ps.setString(5, status);
            ps.setInt(6, idKonten);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error Ubah Konten: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean hapusKonten(int idKonten) {
        try {
            Connection conn = new Koneksi().getConnection();
            String sql = "DELETE FROM konten WHERE id_konten=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idKonten);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error Hapus Konten: " + e.getMessage());
            return false;
        }
    }
}
