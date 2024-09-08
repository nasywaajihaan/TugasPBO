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
        mobil mobilBMW = new mobil("BMW", "minicooper", 2022, "merah" );
        mobil mobilwuling = new mobil("wuling", "wuling Air EV", 2024, "biru");
        
        mobilBMW.displayInfo();
        mobilwuling.displayInfo();

        mobilBMW.startEngine();
        mobilwuling.startEngine();

        mobilBMW.setwarna("merah");
        mobilwuling.displayInfo();
    }     
}
