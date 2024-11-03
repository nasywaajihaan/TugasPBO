/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak10;

/**
 *
 * @author LENOVO
 */
public class main {
 public static void main(String[] args) {
 // Objek Penjumlahan
 operasihitung penjumlahan = new penjumlahan();
 System.out.println("Penjumlahan: " + 
penjumlahan.hitung(10, 5)); // Output: 15
 // Objek Pengurangan
 operasihitung pengurangan = new pengurangan();
 System.out.println("Pengurangan: " + 
pengurangan.hitung(10, 5)); // Output: 5
 }
}

