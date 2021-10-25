/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author musfi
 */
public class Petugas implements UserInterface {
    private final Scanner input;
    
    private final ArrayList<String> nama;
    private final ArrayList<String> alamat;
    private final ArrayList<String> telepon;
    
    public int petugasLogin;
    
    public Petugas(Scanner input) {
        this.input = input;
        
        telepon = new ArrayList<>();
        alamat = new ArrayList<>();
        nama = new ArrayList<>();
        
        this.initListPetugas();
    }
    
    private void initListPetugas() {
        nama.add("Admin");
        alamat.add("Motherboard");
        telepon.add("127001");
    }
    
    public void login() {
        System.out.print("Masukkan id petugas: ");
        this.petugasLogin = input.nextInt();
        System.out.println("Selamat bertugas, " + this.getNama(petugasLogin));
        System.out.println("");
    }

    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return nama.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return telepon.get(id);
    }
}
