/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan55.handphone;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan jenis handphone
 */
public class WindowsPhone extends Handphone{
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getWpKeyStore(){
        return wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore){
        this.wpKeyStore = wpKeyStore;
    }
    
}
