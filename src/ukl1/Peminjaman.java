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
public class Peminjaman {
    private final ArrayList<Integer> idSiswa;
    private final ArrayList<Integer> idBuku;
    private final ArrayList<Integer> banyak;
    
    public Peminjaman() {
        idSiswa = new ArrayList<>();
        idBuku = new ArrayList<>();
        banyak = new ArrayList<>();
    }
    
    public void printPeminjamanSiswa(int idSiswa) {
        System.out.println("Berikut adalah daftar pinjaman siswa id " + idSiswa);
        
        this.idSiswa.stream()
            .filter(id -> (id == idSiswa))
            .map(id -> this.idSiswa.indexOf(id))
            .forEach(index -> {
                System.out.println(index + ". Buku id-" + this.idBuku.get(index) + " | " + this.banyak.get(index) + " buku");
            });
        
        System.out.println("");
    }
    
    public void tambahPeminjaman(int idSiswa, int idBuku, int banyak) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyak);
    }
    
    public Integer getIdBuku(int idSiswa) {
        int index = this.idSiswa.indexOf(idSiswa);
        return this.idBuku.get(index);
    }
    
    public Integer getBanyak(int idSiswa) {
        int index = this.idSiswa.indexOf(idSiswa);
        return this.banyak.get(index);
    }
    
    public void hapusPeminjaman(int idSiswa) {
        int index = this.idSiswa.indexOf(idSiswa);
        this.banyak.remove(index);
        this.idBuku.remove(index);
        this.idSiswa.remove(index);
    }
}
