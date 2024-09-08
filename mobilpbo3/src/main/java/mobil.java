/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getmerk() {
        return merk;
    }
    public void setmerk(String merk) {
        this.merk = merk;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel(String model) {
        this.model = model;
    }
    public int gettahun() {
        return tahun;
    }
    public void settahun(int tahun) {
        this.tahun = tahun;
    }
    public String getwarna() {
        return warna;
    }
    public void setwarna(String warna) {
        this.warna = warna;
    }
    public void displayInfo() {
        System.out.println("merk: " + getmerk());
        System.out.println("model: " + getmodel());
        System.out.println("tahun: " + gettahun());
        System.out.println("warna: " + getwarna());
    }
    public void startEngine() {
        System.out.println("mesin mobil " + merk + " menyala.");
    }
}