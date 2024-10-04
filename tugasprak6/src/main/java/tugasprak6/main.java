/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        keranjangbelanja keranjang = new keranjangbelanja();
        
        buku buku = new buku("panduan java", 100000);
        elektronik elektronik = new elektronik("Laptop", 1500000);
        pakaian pakaian = new pakaian("kemeja", 50000);
        
        keranjang.tambahproduk(buku);
        keranjang.tambahproduk(elektronik);
        keranjang.tambahproduk(pakaian);
        
        System.out.println("total harga setelah diskon" + keranjang.totalHargaSetelahDiskon());
    }
}
