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
class klub {
    private String namaKlub;
    private List<anggota> anggotaList;
    
    public klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }
    
    public void tambahAnggota(anggota anggota) {
        anggotaList.add(anggota);
    }
    
    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        for (anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}
