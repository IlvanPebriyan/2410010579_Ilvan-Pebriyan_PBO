/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class user {
    private int id_user;
    private String username;
    private String password;

    public user(int id_user, String username, String password) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
    }

    public int getIdUser() { return id_user; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
