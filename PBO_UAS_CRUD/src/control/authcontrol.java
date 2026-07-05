/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import db.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class authcontrol {
    public boolean login(String username, String password) {
        try {
            // Mengikuti patokan pemanggilan objek koneksi baru
            Connection conn = new Koneksi().getConnection();
            String sql = "SELECT * FROM user WHERE username=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
        } catch (Exception e) {
            System.out.println("Error Login: " + e.getMessage());
            return false;
        }
    }
}