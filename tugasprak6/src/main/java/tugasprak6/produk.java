/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author LENOVO
 */
abstract class produk {
    String nama;
    double harga;
    
    public produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    abstract double hitungDiskon();
}
