/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo12;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class product implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;

    // Konstruktor
    public product(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Metode untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok);
    }
}