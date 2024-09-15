/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo4;

/**
 *
 * @author LENOVO
 */
public class manusia {
    // Atribut dengan akses modifier yang sesuai
    private String nama;      // Private, hanya bisa diakses dari dalam kelas ini
    protected int usia;      // Protected, bisa diakses dari subclass atau kelas dalam paket yang sama
    public String pekerjaan; // Public, bisa diakses dari mana saja

    // Konstruktor untuk menginisialisasi atribut
    public manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}
