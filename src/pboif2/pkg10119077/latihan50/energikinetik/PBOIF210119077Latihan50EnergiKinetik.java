/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan50.energikinetik;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Menampilkan hasil Energi Kinetik
 */
public class PBOIF210119077Latihan50EnergiKinetik {

    public static void main(String[] args) {
        Bola objBola = new Bola(145, 25);
        
        objBola.tampilData(objBola.getMassa(), objBola.getKecepatan());
    }
    
}
