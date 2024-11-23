/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo11;



/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        perpustakaan perpustakaan = new perpustakaan(10);

        buku buku1 = new buku("janji");
        buku buku2 = new buku("hujan");

        pengarang pengarang1 = new pengarang("Tere Liye");
        pengarang pengarang2 = new pengarang("Tere Liye");

        buku1.tambahPengarang(pengarang1);
        buku2.tambahPengarang(pengarang2);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}
