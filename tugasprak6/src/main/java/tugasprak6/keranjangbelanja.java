/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

class keranjangbelanja {
    ArrayList<produk> produkList = new ArrayList<>();
    
    void tambahproduk(produk produk) {
        produkList.add(produk);
    }
    
    double totalHargaSetelahDiskon() {
        double total = 0;
        for (produk produk : produkList) {
            total += produk.harga = produk.hitungDiskon();
        }
        return total;
    }
    
}
