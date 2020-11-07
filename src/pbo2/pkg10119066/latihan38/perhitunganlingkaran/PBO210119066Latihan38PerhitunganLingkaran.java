/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan38.perhitunganlingkaran;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBO210119066Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diameter, jarijari, luas, keliling;
        System.out.println("====Perhitungan Lingkaran====");
        RumusLingkaran hitung_lingkaran = new RumusLingkaran();
        
        diameter = hitung_lingkaran.getDiameter();
        jarijari = hitung_lingkaran.getJariJari();
        luas = hitung_lingkaran.getLuas();
        keliling = hitung_lingkaran.getKeliling();
        hitung_lingkaran.hasilHitung();
    }
    
}
