/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo11;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {

        perpustakaan perpustakaan = new perpustakaan();

        buku buku1 = new buku("hujan");
        buku buku2 = new buku("janji");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}