CREATE DATABASE db_konten_planner;
USE db_konten_planner;

CREATE TABLE kategori_konten (
    id_kategori INT AUTO_INCREMENT PRIMARY KEY,
    nama_kategori VARCHAR(50) NOT NULL
);

CREATE TABLE platform (
    id_platform INT AUTO_INCREMENT PRIMARY KEY,
    nama_platform VARCHAR(50) NOT NULL
);

CREATE TABLE konten (
    id_konten INT AUTO_INCREMENT PRIMARY KEY,
    judul_konten VARCHAR(100) NOT NULL,
    id_kategori INT NULL DEFAULT NULL,
    id_platform INT NULL DEFAULT NULL,
    tanggal_tayang DATE NULL DEFAULT NULL,
    status ENUM('Draft', 'Produksi', 'Siap Tayang', 'Selesai') NULL DEFAULT 'Draft',
    
    FOREIGN KEY (id_kategori) REFERENCES kategori_konten(id_kategori) ON DELETE SET NULL,
    FOREIGN KEY (id_platform) REFERENCES platform(id_platform) ON DELETE SET NULL
);

CREATE TABLE user (
    id_user INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

INSERT INTO kategori_konten (nama_kategori) VALUES 
('Edukasi'), 
('Hiburan'), 
('Game'), 
('Musik'), 
('Promosi'), 
('Review');

INSERT INTO platform (nama_platform) VALUES 
('Instagram'), 
('TikTok'), 
('YouTube'), 
('X (Twitter)');

INSERT INTO user (username, password) VALUES ('admin', 'password123');