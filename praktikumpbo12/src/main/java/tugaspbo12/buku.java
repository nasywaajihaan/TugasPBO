/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo12;

/**
 *
 * @author LENOVO
 */
import java.io.Serializable;

public class buku implements Serializable {
    private static final long serialVersionUID = 1L; // Menambahkan serialVersionUID
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit;
    }
}