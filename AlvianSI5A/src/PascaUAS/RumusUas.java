/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PascaUAS;

/**
 *
 * @author lab3
 */
public class RumusUas {

    public int RumusUas(int n1) {
         int x = Integer.valueOf(n1);
         String hitung = Integer.toBinaryString(x);
         int test = Integer.valueOf(hitung);
        return test;
    }
    
    public String RumusUas(String n1) {
        int angka = Integer.parseInt(n1);
        String hex = Integer.toHexString(angka);
        return hex;
    }


}
