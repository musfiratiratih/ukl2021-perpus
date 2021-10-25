/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl1;

import java.util.ArrayList;

/**
 *
 * @author musfi
 */
public class Buku {
    private final ArrayList<String> nama;
    private final ArrayList<Integer> stok;
    private final ArrayList<Integer> harga;
    
    public Buku() {
        this.nama = new ArrayList<>();
        this.stok = new ArrayList<>();
        this.harga = new ArrayList<>();

        this.initListBuku();
    }
    
    private void initListBuku() {
        this.setNama("The One");
        this.setStok(10);
        this.setHarga(10);
        
        this.setNama("The Second");
        this.setStok(7);
        this.setHarga(12);
        
        this.setNama("The Third");
        this.setStok(5);
        this.setHarga(15);
    }
    
    public void printListBuku() {
        System.out.println("Berikut ketersediaan buku saat ini.");
        for (int i = 0; i < this.getJumlahBuku(); i++) {
            System.out.println(i + ". " + this.getStok(i) + " buku | " + this.getNama(i) + " | Rp. " + this.getHarga(i) + "K");
        }
    }
    
    public Integer getJumlahBuku() {
        return this.nama.size();
    }
    
    public void setNama(String nama) {
        this.nama.add(nama);
    }
    
    public void setStok(Integer stok) {
        this.stok.add(stok);
    }
    
    public void setHarga(Integer harga) {
        this.harga.add(harga);
    }
    
    public String getNama(int id) {
        return this.nama.get(id);
    }
    
    public Integer getStok(int id) {
        return this.stok.get(id);
    }
    
    public Integer getHarga(int id) {
        return this.harga.get(id);
    }
    
    public void pinjam(int id, int banyak) {
        int sisaStok = this.getStok(id);
        sisaStok -= banyak;
        
        this.stok.set(id, sisaStok);
    }
    
    public void kembali(int id, int banyak) {
        int sisaStok = this.getStok(id);
        sisaStok += banyak;
        
        this.stok.set(id, sisaStok);
    }
}
