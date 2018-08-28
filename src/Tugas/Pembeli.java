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
class Pembeli extends Barang{
    private int idPembeli;
    private String namaPembeli;
    private String alamat;
    private String noTelp;
            
    public Pembeli (int idPembeli, String namaPembeli, String alamat, String noTelp,int id_Barang, String namaBarang, int hargaBarang, String merkBarang)
    {
        super(id_Barang, namaBarang, hargaBarang, merkBarang);
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    
    public void cetak()
    {
        System.out.println("ID Pembeli   :" +this.idPembeli);
        System.out.println("Nama Pembeli :" +this.namaPembeli);
        System.out.println("Alamat       :" +this.alamat);
        System.out.println("Telp         :" +this.noTelp);
        super.cetak();
    }
}
