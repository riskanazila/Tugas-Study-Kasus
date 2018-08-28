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
class Kasir extends Pembeli{
    private String kasir;
    private String tgl;
    
    public Kasir(String kasir, String tgl, int idPembeli, String namaPembeli, String alamat, String noTelp,int id_Barang, String namaBarang, int hargaBarang, String merkBarang)
    {
        super(idPembeli, namaPembeli, alamat, noTelp ,id_Barang, namaBarang, hargaBarang, merkBarang);
        this.tgl = tgl;
        this.kasir = kasir;
    }
    
    public void cetak()
    {
        System.out.println("       ^WELCOME TO MY MARKET^");
        System.out.println("\nKasir        :" +this.kasir);
        System.out.println("Tanggal      :" +this.tgl);
        System.out.println("----------------------------------");
        super.cetak();
    }
}
