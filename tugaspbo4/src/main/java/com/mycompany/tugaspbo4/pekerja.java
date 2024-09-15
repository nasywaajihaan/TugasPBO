/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspbo4;

/**
 *
 * @author LENOVO
 */
public class pekerja {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;

    // Konstruktor
    public pekerja(String nama, int umur, String jabatan, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Metode toString()
    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur + ", Jabatan: " + jabatan + ", Gaji: " + gaji;
    }

    // Metode setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode getter untuk nama
    public String getNama() {
        return nama;
    }

    // Metode getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Metode getter untuk jabatan
    public String getJabatan() {
        return jabatan;
    }

    // Metode getter untuk gaji
    public double getGaji() {
        return gaji;
    }
}
