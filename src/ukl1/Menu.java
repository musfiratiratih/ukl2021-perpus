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
public class Menu {
    private final Scanner input;
    public int menu;
    
    public Menu(Scanner input) {
        this.input = input;
    }
    
    public void pilihMenu() {
        System.out.println("Selamat datang di Perpustakaan");
        System.out.println("1. List Buku");
        System.out.println("2. Peminjaman");
        System.out.println("3. Pengembalian");
        System.out.println("4. Data Siswa");
        System.out.println("99. Keluar");
        System.out.print("=> ");
        this.menu = input.nextInt();
    }
}
