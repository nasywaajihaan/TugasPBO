/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        // Objek Elektronik
        pembayaran elektronik = new elektronik();
        double hargaElektronik = 5000.00; // Contoh harga
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik)); // Output: 100.0

        // Objek Makanan
        pembayaran makanan = new makanan();
        double hargaMakanan = 250.00; // Contoh harga
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan)); // Output: 10.0
    }
}
