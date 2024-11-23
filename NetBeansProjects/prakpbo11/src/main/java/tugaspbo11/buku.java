/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class buku {
    private String judul;
    private List<pengarang> pengarangList;

    public buku(String judul) {
        this.judul = judul;
        this.pengarangList = new ArrayList<>();
    }

    public void tambahPengarang(pengarang pengarang) {
        pengarangList.add(pengarang);
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        for (pengarang pengarang : pengarangList) {
            pengarang.infoPengarang();
        }
    }
}
