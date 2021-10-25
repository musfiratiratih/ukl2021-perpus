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
public class Siswa implements UserInterface {
    private final Scanner input;
    
    private final ArrayList<String> nama;
    private final ArrayList<String> alamat;
    private final ArrayList<String> telepon;
    private final ArrayList<Boolean> status;
    
    public int idSiswa;
    
    public Siswa(Scanner input) {
        this.input = input;
        
        status = new ArrayList<>();
        telepon = new ArrayList<>();
        alamat = new ArrayList<>();
        nama = new ArrayList<>();
        
        this.initListSiswa();
    }
    
    private void initListSiswa() {
        nama.add("Musfirati");
        alamat.add("Malang");
        telepon.add("081234567890");
        status.add(true);
    }
    
    public void pilihSiswa() {
        System.out.print("Masukkan Indek Siswa: ");
        this.idSiswa = input.nextInt();
        System.out.println("Hallo, " + this.getNama(idSiswa));
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
    
    public void setStatus(Boolean status) {
        this.status.add(status);
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
    
    public Boolean getStatus(int id) {
        return status.get(id);
    }
    
    public void updateStatus(Boolean status) {
        this.status.set(idSiswa, status);
    }
}
