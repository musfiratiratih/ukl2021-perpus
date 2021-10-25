/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl1;

import java.util.Scanner;

/**
 *
 * @author musfi
 */
public class UKL1 {
    static Scanner input;
    
    static Petugas petugas;
    static Siswa siswa;
    static Buku buku;
    static Peminjaman peminjaman;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        petugas = new Petugas(input);
        siswa = new Siswa(input);
        buku = new Buku();
        peminjaman = new Peminjaman();
        
        Menu menu = new Menu(input);
        
        petugas.login();
        siswa.pilihSiswa();
        System.out.println("");
        
        Boolean ulang = true;
        while (ulang) {
            menu.pilihMenu();
            switch (menu.menu) {
                case 1 -> buku.printListBuku();
                case 2 -> prosesPeminjaman();
                case 3 -> prosesPengembalian();
                case 4 -> peminjaman.printPeminjamanSiswa(siswa.idSiswa);
                case 99 -> ulang = false;
                default -> {
                    System.out.println("Mohon maaf, menu yang dipilih tidak tersedia.");
                    ulang = false;
                }
            }
            System.out.println("");
        }
        
        input.close();
    }
    
    public static void prosesPeminjaman() {
        if (!siswa.getStatus(siswa.idSiswa)) {
            System.out.println("Siswa sedang meminjam buku, tidak dapat meminjam lagi");
            return;
        }
        
        System.out.print("Masukkan id buku: "); int idBuku = input.nextInt();
        System.out.print("Banyak buku: "); int banyak = input.nextInt();
        
        if (buku.getStok(idBuku) < banyak) {
            System.out.println("Sisa stok buku tidak mencukupi");
            return;
        }
        
        peminjaman.tambahPeminjaman(siswa.idSiswa, idBuku, banyak);
        buku.pinjam(idBuku, banyak);
        siswa.updateStatus(Boolean.FALSE);
        System.out.println("Berhasil melakukan peminjaman buku");
    }
    
    public static void prosesPengembalian() {
        int idBuku = peminjaman.getIdBuku(siswa.idSiswa);
        int banyak = peminjaman.getBanyak(siswa.idSiswa);
        
        peminjaman.hapusPeminjaman(siswa.idSiswa);
        buku.kembali(idBuku, banyak);
        siswa.updateStatus(Boolean.TRUE);
        
        System.out.println("Berhasil melakukan pengembalian buku");
    }
}
