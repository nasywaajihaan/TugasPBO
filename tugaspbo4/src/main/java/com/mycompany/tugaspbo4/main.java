/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo4;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        pekerja pekerja1 = new pekerja("Budi", 20, "Programmer", 5000.0);

        // Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println(pekerja1.toString());

        // Mengubah nama pekerja menggunakan metode setter
        pekerja1.setNama("Budi");

        // Menampilkan ulang informasi pekerja
        System.out.println(pekerja1.toString());

        // Coba akses atribut secara langsung
        // Ini akan menyebabkan error kompilasi karena atribut akses modifier:
        // System.out.println("Nama: " + pekerja1.getNama()); // Harus menggunakan getter
        // System.out.println("Usia: " + pekerja1.getUmur()); // Harus menggunakan getter
        // System.out.println("Gaji: " + pekerja1.getGaji()); // Harus menggunakan getter
    }
}
