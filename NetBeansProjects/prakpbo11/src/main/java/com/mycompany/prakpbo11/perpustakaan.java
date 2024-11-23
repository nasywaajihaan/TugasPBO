/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakpbo11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class perpustakaan {
        private List<buku> bukuList;
    
    public perpustakaan() {
        this.bukuList = new ArrayList<>();
    }
    
    public void tambahBuku(buku buku) {
        bukuList.add(buku);
    }
    
    public void infoPerpustakaan() {
        for (buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
