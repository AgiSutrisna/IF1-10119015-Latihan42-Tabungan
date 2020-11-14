/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("======Program Penarikan Uang=====");
        System.out.print("Masukan Saldo Awal : ");
        int saldo = input.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah uang yang akan diambil : ");
        int jumlah = input.nextInt();
        
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    }
    
}
