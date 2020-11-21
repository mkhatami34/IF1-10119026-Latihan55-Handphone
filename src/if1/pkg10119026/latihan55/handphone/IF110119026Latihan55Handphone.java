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
public class IF110119026Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android","Grand", 3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store   : "+ android.getKeyStore()+"\n");

        BlackBerry bb = new BlackBerry("BlackBerry","RIM","Curve",2000000);
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN   : "+bb.getPinBB()+"\n");

        WindowsPhone wp = new WindowsPhone("Nokia", "Win8","Lumia",1000000);
        wp.displayProduct();
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store   : "+wp.getWpKeyStore());
    }
    
}
