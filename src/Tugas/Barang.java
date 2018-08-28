/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author WINDOWS 10
 */
public class Barang {
    public int id_Barang;
    public String namaBarang;
    public int hargaBarang;
    public String merkBarang;
    
    public Barang (int id_Barang, String namaBarang, int hargaBarang, String merkBarang)
    {
        this.id_Barang = id_Barang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.merkBarang = merkBarang;
    }
    
    public void cetak()
    {
        System.out.println("ID Barang    :" +this.id_Barang);
        System.out.println("Nama Barang  :" +this.namaBarang);
        System.out.println("Harga        :" +this.hargaBarang);
        System.out.println("Merk         :" +this.merkBarang);
    }
}
