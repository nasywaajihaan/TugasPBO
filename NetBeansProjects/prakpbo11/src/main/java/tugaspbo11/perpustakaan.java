/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo11;

/**
 *
 * @author LENOVO
 */
public class perpustakaan {
    private buku[] bukuList;
    private int count;

    public perpustakaan(int kapasitas) {
        bukuList = new buku[kapasitas];
        count = 0;
    }

    public void tambahBuku(buku buku) {
        if (count < bukuList.length) {
            bukuList[count] = buku;
            count++;
        } else {
            System.out.println("Perpustakaan sudah penuh!");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Informasi Buku di Perpustakaan:");
        for (int i = 0; i < count; i++) {
            bukuList[i].infoBuku();
        }
    }
}
