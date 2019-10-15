/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan36.targetsaldotabungan;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class Tabungan {
    
    private int hitungSaldo(int saldo, double bunga) {
        int saldoTerbunga = (int) (saldo * bunga);
        return saldo + saldoTerbunga;
    }
    
    public void tampilHasil(int saldo, int target, double bunga) {
        int i = 1;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
        do {
            saldo = hitungSaldo(saldo, bunga);
            System.out.println("Saldo Bulan ke-" + i + " Rp. " + nf.format(saldo));
            i++;
        } while (saldo<target);
    }
}
